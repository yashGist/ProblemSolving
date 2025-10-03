package com.strings;

import java.util.Arrays;

public class Anagram {

    public static boolean anagramCheck(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        return Arrays.equals(chArr1, chArr2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (anagramCheck(str1, str2)) {
            System.out.println("Anagram Strings!");
        } else {
            System.out.println("Not Anagram Strings");
        }

    }
}
