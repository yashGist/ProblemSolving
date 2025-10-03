package com.patterns;

public class PSPattern1 {


    public static void pattern1() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern3() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void pattern4() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void pattern5() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void pattern6() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern7() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern8() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void pattern9() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern10() {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern11() {

        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern12() {
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern13() {
        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'E'; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern14() {
        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'E'; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern15() {
        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern16() {
        for (char i = 'A'; i <= 'E'; i++) {
            for (int j = 'E'; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern17() {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern17();

    }
}
