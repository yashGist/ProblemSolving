package com.calculator;

public class Test {
    public static void main(String[] args) {
        ScientificCalculator sciCalc = new ScientificCalculator();

        System.out.println("Sum of 2 numbers: " + sciCalc.sum(10, 20));
        System.out.println("Sum of 3 numbers: " + sciCalc.addThreeNumbers(5, 10, 15));
        System.out.println("Difference: " + sciCalc.difference(50, 20));
        System.out.println("Product: " + sciCalc.product(6, 7));
        System.out.println("Quotient: " + sciCalc.quotient(20, 4));
    }
}
