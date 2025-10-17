package com.patterns;

public class PatternsQuest {

    public static void pattern17() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern19() {

        for (int i = 1; i <= 5; i++) {
            for (int sp = 1; sp <= i - 1; sp++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pattern20() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int sp = 4; sp >= i; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern21() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int stars = (n * 2) - (i * 2 - 1);
            for (int sp = 0; sp < i; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern22() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int sp = n - i; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern23() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= i; sp++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern24() {
        int n = 5;
        int loopEnd = n * 2 - 1;
        for (int i = 1; i <= loopEnd; i++) {
            int stars = (i <= 5) ? i : (n * 2) - i;
            int spaces = (i <= 5) ? (n - i) : i - n;
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern25() {
        int n = 5;
        int totalRows = n * 2;
        for (int i = 1; i <= totalRows; i++) {
            int stars = (i <= n) ? n - i + 1 : i - n;
            int spaces = (i <= n) ? i - 1 : totalRows - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern27() {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            int spaces = (i < 5) ? n - 2 - i - 1 : i - (n - 2) + 1;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            if (i <= 4) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
            } else {
                int k = n - i + 1;  // mirror value
                for (int j = k; j >= 1; j--) {
                    System.out.print(j);
                }
                for (int j = 2; j <= k; j++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void pattern31() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int i = n; i >= row; i--) {
                System.out.print(" ");
            }
            for (int i = row; i >= 1; i--) {
                System.out.print(i);
            }
            for (int i = 2; i <= row; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern30() {
        int n = 5;
        int totalRows = n * 2;
        for (int i = 1; i < totalRows; i++) {
            int spaces = (i <= n) ? n - i : i - n;
            int stars = (i <= n) ? i : totalRows - i;
            for (int sp = 1; sp <= spaces; sp++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern28() {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(++count + " ");
            }
            System.out.println();
        }
    }

    public static void pattern29() {
        for (int i = 1; i <= 5; i++) {
            int start = ((1 & i) == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pattern32(int n) {
        int originalN = n;
        n = 2 * n;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - 1; j++) {
                int number = originalN - Math.min(Math.min(i, j), Math.min(n - i, n - j)) + 1;
                System.out.print(number);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern27();
    }

}
