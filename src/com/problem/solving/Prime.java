package com.problem.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prime {

    public static boolean checkPrime(int n) {
        boolean flag = true;
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        int lastNumber = (int) Math.sqrt(n);
        for (int i = 3; i <= lastNumber; i += 2) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        boolean isPrime;
        for (int i = 1; i <= 100; i++) {
            isPrime = checkPrime(i);
            if (isPrime) {
                System.out.print(i + "  ");
            }
        }
    }
}