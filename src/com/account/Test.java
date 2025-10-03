package com.account;

public class Test {

    public int a = 10;

    public void add() {
        int a = 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int b = 20;
        Test test = new Test();
        System.out.println(b);
        System.out.println(test.a);
    }
}
