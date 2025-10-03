package com.strings;

public class RemoveDuplicates {

    public static int add(int... a) {
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {

        int sum = add(5, 5, 5);
        System.out.println(sum);
    }
}
