package com.strings;

import java.util.Arrays;

public class UpperCase {

    public static void main(String[] args) {
        String str = "i am not in danger, i am the danger!";
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            System.out.print(ch);
        }

    }
}
