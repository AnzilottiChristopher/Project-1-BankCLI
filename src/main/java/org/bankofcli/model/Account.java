package org.bankofcli.model;

import java.math.BigDecimal;

public class Account {
    private String firstName;
    private String lastName;
    private final String accountId;
    private int PIN;
    private BigDecimal balance;

    /**
     * Creates a new Account. Defaults to zero balance.
     * 
     * @param firstName The first name of the user.
     * @param lastName The last name of the user.
     * @param accountID The account ID of the account.
     * @param PIN The secret PIN of the account.
     */
    public Account(String firstName, String lastName, 
        String accountID, int PIN) {
            this(firstName, lastName, accountID, PIN, BigDecimal.ZERO);
    }

    /**
     * Creates a new Account. Manually specified starting balance.
     * 
     * @param firstName The first name of the user.
     * @param lastName The last name of the user.
     * @param accountID The account ID of the account.
     * @param PIN The secret PIN of the account.
     * @param balance The starting balance of the account.
     */
    public Account(String firstName, String lastName, 
        String accountID, int PIN, BigDecimal balance) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.accountId = accountID;
            this.PIN = PIN;
            this.balance = balance;
    }

    /**
     * Gets the first name on the account.
     * 
     * @return The first name on the account.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Gets the last name on the account.
     * 
     * @return The last name on the account.
     */
    public String getLastName() {
        return this.lastName;
    }
    
    /**
     * Gets the full name on the account.
     * @return The full name on the account.
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * Gets the account ID of the account.
     * 
     * @return The account ID of the account.
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * Gets the PIN of the account.
     * 
     * @return The PIN of the account.
     */
    public int getPIN() {
        return this.PIN;
    }

    @Override
    public String toString() {
        return "First Name: " + this.firstName + 
        "\nLast Name: " + this.lastName +
        "\nAccount ID: " + this.accountId +
        "\nBalance: " + this.balance;
    }
}
