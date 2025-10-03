package com.account;

public class TestApp {
    public static void main(String[] args) {
        GooglePay gpay = new GooglePay();
        PhonePe phonePe = new PhonePe();

        gpay.checkBalance();   // 5000
        phonePe.checkBalance();// 5000

        gpay.sendMoney(1000);  // deduct 1000
        phonePe.checkBalance();// 4000 (same across apps)

        phonePe.addMoney(500); // add 500
        gpay.checkBalance();   // 4500 (Google Pay also sees updated balance)
    }
}
