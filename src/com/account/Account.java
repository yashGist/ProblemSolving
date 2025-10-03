package com.account;

public class Account {
    private static double balance = 5000; // Shared account balance

    public static double getBalance() {
        return balance;
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
