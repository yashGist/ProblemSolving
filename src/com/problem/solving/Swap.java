package com.problem.solving;

public class Swap {

    public static void swapUsing3Variables(int a, int b) {
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a  " + a);
        System.out.print("b  " + b);
    }

    public static void swapUsing2Variables(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a  " + a);
        System.out.print("b  " + b);
    }

    public static void swapWithoutUsingOperator(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a  " + a);
        System.out.print("b  " + b);
    }

    public static void main(String[] args) {
        swapWithoutUsingOperator(9, 1);
    }
}
