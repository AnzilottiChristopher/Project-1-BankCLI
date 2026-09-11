package org.bankofcli.repository.sqlite;

import java.math.BigDecimal;
import java.util.Optional;

import org.bankofcli.model.Account;
import org.bankofcli.repository.AccountRepository;

public class SQLiteAccountRepository implements AccountRepository {

    @Override
    public Account create(Account account) {
        // TODO: Make sure to create a UUID for the Account ID. Otherwise, it won't be accepted into the database.
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public Optional<Account> findById(String accountId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public boolean existsById(String accountId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public BigDecimal getBalance(String accountId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
    }
}
