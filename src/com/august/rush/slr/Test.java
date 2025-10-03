package com.august.rush.slr;

import java.util.Scanner;

public class Test {

    public static int checkLeapYear(int year) {
        if (year % 400 == 0) {
            return 1;
        } else if (year % 100 == 0) {
            return 0;
        } else if (year % 4 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println((int) Math.log10(scanner.nextInt()) + 1);
        }
    }

}
