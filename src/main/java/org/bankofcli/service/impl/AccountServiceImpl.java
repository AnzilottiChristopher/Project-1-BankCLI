package org.bankofcli.service.impl;

import java.math.BigDecimal;
import java.util.Objects;
import org.bankofcli.repository.AccountRepository;
import org.bankofcli.service.AccountService;

public class AccountServiceImpl implements AccountService {
    private final AccountRepository accounts;

    public AccountServiceImpl(AccountRepository accounts) {
        this.accounts = Objects.requireNonNull(accounts);
    }

    @Override
    public BigDecimal getBalance(String accountId) {
        BankingRules.existingAccount(accounts, accountId);
        return accounts.getBalance(accountId);
    }
}
