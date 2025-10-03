package com.problem.solving;

public class Pattern {

    public static void pattern5() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern8() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern11() {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }

        }

    }

    public static void pattern15() {
        for (int i = 1; i <= 5; i++) {
            for (int k = 4; k >= 1; k--) {
                System.out.print("*");
            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*");
//            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern15();
    }
}
