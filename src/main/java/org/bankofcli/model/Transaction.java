package org.bankofcli.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private long id;
    private String accountId;
    private TransactionType type;
    private BigDecimal amount;
    private LocalDateTime timestamp;

    /**
     * Create a new Transaction.
     * 
     * @param id The transaction ID.
     * @param accountId The account ID involved in the transaction.
     * @param type The type of transaction. Look at {@link TransactionType}
     * @param amount The amount of money involved in the transaction.
     * @param timestamp The timestamp of the transaction.
     */
    public Transaction(long id, String accountId,
        TransactionType type, BigDecimal amount, 
        LocalDateTime timestamp) {
            this.id = id;
            this.accountId = accountId;
            this.type = type;
            this.amount = amount;
            this.timestamp = timestamp;
    }


    /** 
     * Gets the transaction ID of the transaction.
     * 
     * @return The transaction ID.
     */
    public long getId() {
        return this.id;
    }

    /** 
     * Gets the account ID of the transaction.
     * 
     * @return The account ID of the transaction.
     */
    public String getAccountId() {
        return this.accountId;
    }

    /** 
     * Gets the transaction type of the transaction.
     * 
     * @return The transaction type of the transaction.
     */
    public TransactionType getType() {
        return this.type;
    }

    /** 
     * Gets the amount involved in the transaction.
     * 
     * @return The amount involved in the transaction.
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /** 
     * Gets the timestamp of the transaction.
     * 
     * @return The timestamp of the transaction.
     */
    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    @Override
    public String toString() {
        return "Transaction ID: " + this.id +
        "\nAccount ID: " + this.accountId + 
        "\nTransaction Type: " + this.type.toString() + 
        "\nAmount: " + this.amount + 
        "\nTimestamp: " + this.timestamp;
    }
}
