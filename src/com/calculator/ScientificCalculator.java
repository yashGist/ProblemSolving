package com.calculator;

// Child class
class ScientificCalculator extends Calculator {

    // Example of calling parent class method using super
    public int addThreeNumbers(int a, int b, int c) {
        return super.add(a, b, c);  // directly reuse parent method
    }

    // Example of calling subtraction
    public int difference(int a, int b) {
        return super.subtract(a, b);
    }

    // Example of calling multiplication
    public int product(int a, int b) {
        return super.multiply(a, b);
    }

    // Example of calling division
    public double quotient(int a, int b) {
        return super.divide(a, b);
    }

    // Example of calling 2-number addition
    public int sum(int a, int b) {
        return super.add(a, b);
    }
}

// Main class to test

