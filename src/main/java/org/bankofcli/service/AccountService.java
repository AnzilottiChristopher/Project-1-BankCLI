package org.bankofcli.service;

import java.math.BigDecimal;

public interface AccountService {
    BigDecimal getBalance(String accountId);
}
