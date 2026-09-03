package org.bankofcli.api;

public class Application {
    public String balance() {
        //!TODO Read from database current balance
        //!TODO then return balance

        return "$100.00";
    }

    public String Deposit(double deposit){
        //!TODO Read from database current balance
        //!ToDo take balance and add deposit

        return "deposit of $" + deposit + " successful, new balance: " + balance();
    }
}
