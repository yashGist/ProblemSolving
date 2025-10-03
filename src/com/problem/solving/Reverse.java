package com.problem.solving;

public class Reverse {

    public static String reverse(String str) {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "greet";
        System.out.println(reverse(str));
    }
}
