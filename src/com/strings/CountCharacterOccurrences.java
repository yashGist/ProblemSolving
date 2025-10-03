package com.strings;

public class CountCharacterOccurrences {

    public static void main(String[] args) {
        String str = "This is swiss army";
        long count = str.chars().filter(ch -> ch == 'y').count();
        System.out.println(count);
    }
}
