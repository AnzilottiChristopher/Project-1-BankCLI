package org.bankofcli.api;

public class Application {
    public String balance() {
        //!TODO Read from database current balance
        //!TODO then return balance

        return "Your Balance is: $100.00";
    }

    public String transfer() {
        //!TODO Read sender and receiver accounts
        //!TODO Read transfer amount
        //!TODO Transfer money between accounts

        return "transfer successful";
    }
}
