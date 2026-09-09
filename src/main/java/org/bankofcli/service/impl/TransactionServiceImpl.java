package org.bankofcli.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import org.bankofcli.model.Transaction;
import org.bankofcli.repository.AccountRepository;
import org.bankofcli.repository.TransactionRepository;
import org.bankofcli.service.BankingException;
import org.bankofcli.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TransactionServiceImpl implements TransactionService {
    private static final Logger log = LoggerFactory.getLogger(TransactionServiceImpl.class);
    private final AccountRepository accounts;
    private final TransactionRepository transactions;

    public TransactionServiceImpl(AccountRepository accounts, TransactionRepository transactions) {
        this.accounts = Objects.requireNonNull(accounts);
        this.transactions = Objects.requireNonNull(transactions);
    }

    @Override
    public void deposit(String accountId, BigDecimal amount) {
        amount = BankingRules.amount(amount);
        BankingRules.existingAccount(accounts, accountId);
        transactions.deposit(accountId, amount);
        log.info("Deposit succeeded");
    }

    @Override
    public void withdraw(String accountId, BigDecimal amount) {
        amount = BankingRules.amount(amount);
        requireFunds(accountId, amount);
        transactions.withdraw(accountId, amount);
        log.info("Withdrawal succeeded");
    }

    @Override
    public void transfer(String sourceAccountId, String destinationAccountId, BigDecimal amount) {
        amount = BankingRules.amount(amount);
        BankingRules.existingAccount(accounts, sourceAccountId);
        BankingRules.existingAccount(accounts, destinationAccountId);
        if (sourceAccountId.equals(destinationAccountId)) {
            throw new BankingException("Cannot transfer to the same account.");
        }
        requireFunds(sourceAccountId, amount);
        // The repository must update both balances and history atomically.
        transactions.transfer(sourceAccountId, destinationAccountId, amount);
        log.info("Transfer succeeded");
    }

    private void requireFunds(String accountId, BigDecimal amount) {
        BankingRules.existingAccount(accounts, accountId);
        if (accounts.getBalance(accountId).compareTo(amount) < 0) {
            log.warn("Transaction rejected: insufficient funds");
            throw new BankingException("Insufficient funds.");
        }
    }

    @Override
    public List<Transaction> getRecentTransactions(String accountId) {
        BankingRules.existingAccount(accounts, accountId);
        return List.copyOf(transactions.findRecentByAccountId(accountId, 10));
    }
}
