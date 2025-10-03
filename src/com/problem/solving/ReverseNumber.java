package com.problem.solving;

public class ReverseNumber {

    public static void main(String[] args) {
        int n = 10500;
        int rem;
        int rev = 0;
        int trailingZeros = 0;
        int temp = n;
        while (temp % 10 == 0) {
            trailingZeros++;
            temp /= 10;
        }
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        StringBuilder finalString = new StringBuilder();
        for (int i = 1; i <= trailingZeros; i++) {
            finalString.append("0");
        }
        finalString.append(rev);
        System.out.println(finalString);
    }
}
