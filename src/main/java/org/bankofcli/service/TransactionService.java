package org.bankofcli.service;

import java.math.BigDecimal;
import java.util.List;

import org.bankofcli.model.Transaction;

public interface TransactionService {
    void deposit(String accountId, BigDecimal amount);

    void withdraw(String accountId, BigDecimal amount);

    void transfer(String sourceAccountId,
            String destinationAccountId, BigDecimal amount);

    List<Transaction> getRecentTransactions(String accountId);
}
