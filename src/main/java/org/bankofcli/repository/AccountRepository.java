package org.bankofcli.repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.bankofcli.model.Account;

public interface AccountRepository {
    Account create(Account account);
    Optional<Account> findById(String accountId);
    boolean existsById(String accountId);
    BigDecimal getBalance(String accountId);
}