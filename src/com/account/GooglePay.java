package com.account;

public class GooglePay {
    public void checkBalance() {
        System.out.println("GooglePay Balance: " + Account.getBalance());
    }

    public void sendMoney(double amount) {
        Account.withdraw(amount);
        System.out.println("GooglePay sent: " + amount);
    }
}
