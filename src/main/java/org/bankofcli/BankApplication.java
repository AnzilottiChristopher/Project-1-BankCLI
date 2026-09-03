package org.bankofcli;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean open = true;

        while (open) {
            System.out.println("Welcome to the Bank Of CLI!");
            System.out.println("If you have an existing account please login using your Account ID " +
                    "and PIN.");
            System.out.println("If you are a new user, please register.");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Check Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Transfer");
            System.out.println("7. Transaction History");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Register selected");
                    open = returnOrExit(scanner);
                    break;

                case "2":
                    System.out.println("Login selected");
                    open = returnOrExit(scanner);
                    break;

                case "3":
                    System.out.println("Check Balance selected");
                    open = returnOrExit(scanner);
                    break;

                case "4":
                    System.out.println("Deposit selected");
                    open = returnOrExit(scanner);
                    break;

                case "5":
                    System.out.println("Withdraw selected");
                    open = returnOrExit(scanner);
                    break;

                case "6":
                    System.out.println("Transfer selected");
                    open = returnOrExit(scanner);
                    break;

                case "7":
                    System.out.println("Transaction History selected");
                    open = returnOrExit(scanner);
                    break;

                case "8":
                    System.out.println("Exiting Bank of CLI. Thank you!");
                    open = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-8.");
            }
        }

        scanner.close();
    }

    public static boolean returnOrExit(Scanner scanner) {

        while (true) {
            System.out.println();
            System.out.println("1. Return to Main Menu");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println();
                    return true;

                case "2":
                    System.out.println("Exiting Bank of CLI. Thank you!");
                    return false;

                default:
                    System.out.println("Invalid option. Please choose 1 or 2.");
            }
        }
    }
}