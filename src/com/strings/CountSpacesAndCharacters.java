package com.strings;

public class CountSpacesAndCharacters {

    public static void main(String[] args) {
        String str = "I am not in danger, I am the danger!";
        char[] ch = str.toCharArray();
        int spaces = 0;
        int characters = 0;
        for (char c : ch) {
            if (c == ' ') {
                spaces++;
            } else {
                characters++;
            }
        }
        System.out.println("spaces " + spaces);
        System.out.println("characters " + characters);

    }
}
