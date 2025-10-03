package com.calculator;

// Parent class
class Calculator {

    // Method 1: Addition of 2 numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Addition of 3 numbers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method 4: Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method 5: Division
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return (double) a / b;
    }
}