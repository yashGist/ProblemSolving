package com.strings;

public class NonRepeatingCharacter {
    public static int findFrequency(char[] chArr, char ch) {
        int count = 0;
        for (char c : chArr) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "swiss";
        char[] chArr = str.toCharArray();
        for (char c : chArr) {
            int count = findFrequency(str.toCharArray(), c);
            if (count == 1) {
                System.out.println(c);
                break;
            }
        }

    }
}
