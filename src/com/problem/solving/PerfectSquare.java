package com.problem.solving;

public class PerfectSquare {
    public static boolean checkPerfectSquare(int n) {
        int square = (int) Math.sqrt(n);
        return square * square == n;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(checkPerfectSquare(n));


    }
}
