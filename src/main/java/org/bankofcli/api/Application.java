package org.bankofcli.api;

import java.util.Scanner;

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

    public String Deposit(){
        //!TODO Read from database current balance
        double balance = 100; //this shouldn't be hard coded in future

        Scanner scanner = new Scanner(System.in);
        System.out.print("how much do you want to deposit?");

        double deposit = scanner.nextDouble();

        balance += deposit;

        return "deposit of $" + deposit + " successful, new balance: " + balance;
    }
}
