package com.problem.solving;

import java.math.BigInteger;

public class FactorialBig {

    public static void main(String[] args) {
        BigInteger num = BigInteger.valueOf(12);
        BigInteger fact = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
            fact = fact.multiply(i);
        }
        System.out.println(fact);
    }

}
