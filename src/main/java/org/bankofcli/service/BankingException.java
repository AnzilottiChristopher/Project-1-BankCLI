package org.bankofcli.service;

/** A banking rule violation that can be shown to the user. */
public class BankingException extends RuntimeException {
    public BankingException(String message) {
        super(message);
    }
}
