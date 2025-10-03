package com.patterns;

import java.math.BigInteger;
import java.util.Scanner;

public class SLRPatterns {


    public static void printC() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == 5 || j == 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void printO() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }


    public static void printZ() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 5 - i + 1) {
                    System.out.print("*");
                } else if (j <= 5 - i + 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printS() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i == 1 || i == 4 || i == 7 || (i < 4) && j == 1 || (i > 4) && j == 6) {
                    System.out.print("*");
                } else if (i > 4) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    System.out.print(count);
                } else {
                    System.out.print(" ");
                }
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
