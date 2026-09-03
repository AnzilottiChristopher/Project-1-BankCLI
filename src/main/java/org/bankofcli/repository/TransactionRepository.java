package org.bankofcli.repository;

import java.math.BigDecimal;
import java.util.List;

import org.bankofcli.model.Transaction;

public interface TransactionRepository {
    void deposit(String accountId, BigDecimal amount);

    void withdraw(String accountId, BigDecimal amount);

    void transfer(String sourceAccountId,
            String destinationAccountId, BigDecimal amount);

    List<Transaction> findRecentByAccountId(String accountId,
        int limit);
}
