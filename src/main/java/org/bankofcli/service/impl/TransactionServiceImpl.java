package org.bankofcli.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.bankofcli.model.Transaction;
import org.bankofcli.service.TransactionService;

public class TransactionServiceImpl implements TransactionService{

    @Override
    public void deposit(String accountId, BigDecimal amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    @Override
    public void withdraw(String accountId, BigDecimal amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

    @Override
    public void transfer(String sourceAccountId, String destinationAccountId, BigDecimal amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transfer'");
    }

    @Override
    public List<Transaction> getRecentTransactions(String accountId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRecentTransactions'");
    }
    
}
