package se.lexicon;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 500.0;

        System.out.println("Your current balance is: " + balance);

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {

            withdraw(balance, amount);

        } catch (InsufficientBalanceException e) {

            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient balance! You cannot withdraw this amount."
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: " + balance);
    }
}