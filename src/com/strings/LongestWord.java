package com.strings;

import java.util.Arrays;

public class LongestWord {

    public static void main(String[] args) {
        String str = "I am learning Java programming";
        String[] words = str.split(" ");
        int maxCount = Integer.MIN_VALUE;
        String finalWord = " ";
        for (String word : words) {
            if (word.length() > maxCount) {
                maxCount = word.length();
                finalWord = word;
            }
        }
        System.out.println(finalWord);

    }
}
