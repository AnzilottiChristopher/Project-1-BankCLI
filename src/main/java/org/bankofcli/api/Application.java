package org.bankofcli.api;

import java.util.Scanner;

public class Application {
    public String balance() {
        //!TODO Read from database current balance
        //!TODO then return balance

        return "$100.00";
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
