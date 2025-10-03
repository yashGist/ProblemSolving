package com.account;

public class PhonePe {
    public void checkBalance() {
        System.out.println("PhonePe Balance: " + Account.getBalance());
    }

    public void addMoney(double amount) {
        Account.deposit(amount);
        System.out.println("PhonePe added: " + amount);
    }
}
