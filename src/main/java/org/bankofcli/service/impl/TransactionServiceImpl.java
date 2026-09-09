package org.bankofcli.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import org.bankofcli.model.Transaction;
import org.bankofcli.repository.TransactionRepository;
import org.bankofcli.service.TransactionService;

public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = Objects.requireNonNull(transactionRepository);
    }

    @Override
    public void deposit(String accountId, BigDecimal amount) {
        // Deposit is handled by Xavier
        throw new UnsupportedOperationException("Deposit is not implemented yet");
    }

    @Override
    public void withdraw(String accountId, BigDecimal amount) {
        // Withdraw is handled by Chandra
        throw new UnsupportedOperationException("Withdraw is not implemented yet");
    }

    @Override
    public void transfer(String sourceAccountId,
                         String destinationAccountId,
                         BigDecimal amount) {

        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                    "Transfer amount must be greater than zero.");
        }

        if (sourceAccountId == null || destinationAccountId == null ||
                sourceAccountId.isBlank() || destinationAccountId.isBlank()) {
            throw new IllegalArgumentException(
                    "Account IDs cannot be empty.");
        }

        if (sourceAccountId.equals(destinationAccountId)) {
            throw new IllegalArgumentException(
                    "Source and destination accounts must be different.");
        }

        transactionRepository.transfer(
                sourceAccountId,
                destinationAccountId,
                amount
        );
    }

    @Override
    public List<Transaction> getRecentTransactions(String accountId) {
        // Transaction history is handled by another team member
        throw new UnsupportedOperationException(
                "Transaction history is not implemented yet");
    }
}
