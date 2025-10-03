package com.problem.solving;

public class VowelOrConsonant {

    public static boolean checkVowels(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        } else if (ch >= 'A' && ch <= 'Z') {
            return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkVowels('h'));
    }
}
