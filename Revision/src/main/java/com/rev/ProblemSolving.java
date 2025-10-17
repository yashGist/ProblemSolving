package com.rev;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProblemSolving {

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        int lastNum = (int) Math.sqrt(n);
        for (int i = 3; i <= lastNum; i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //java streams
    public static List<Integer> printSeriesOfPrimeNumbers(int n) {
        return IntStream.rangeClosed(0, n)
                .filter(ProblemSolving::isPrimeNumber)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> primeSeries (int n ){
        return IntStream.rangeClosed(0,n)
                .filter(ProblemSolving::isPrimeNumber)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(4));
        System.out.println(printSeriesOfPrimeNumbers(10));
    }
}
