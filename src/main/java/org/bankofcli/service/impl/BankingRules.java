package org.bankofcli.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.bankofcli.repository.AccountRepository;
import org.bankofcli.service.BankingException;

public final class BankingRules {
    private BankingRules() {}

    public static void accountId(String id) {
        if (id == null || !id.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^A-Za-z0-9])[!-~]{4,32}")) {
            throw new BankingException("Account ID must be 4-32 characters with at least one uppercase letter, one lowercase letter, one number, and one special character (such as -, $, or #), with no spaces.");
        }
    }

    public static void existingAccount(AccountRepository accounts, String id) {
        accountId(id);
        if (!accounts.existsById(id)) {
            throw new BankingException("Account does not exist.");
        }
    }

    public static BigDecimal amount(BigDecimal amount) {
        if (amount == null || amount.signum() <= 0) {
            throw new BankingException("Amount must be greater than zero.");
        }
        try {
            return amount.setScale(2, RoundingMode.UNNECESSARY);
        } catch (ArithmeticException e) {
            throw new BankingException("Amount must contain no fractions of a cent.");
        }
    }
}
