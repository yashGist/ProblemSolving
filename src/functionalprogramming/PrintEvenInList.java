package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class PrintEvenInList {
    public static void printEven(List<Integer> numbers) {
        numbers
                .stream()
                .filter(number -> (number & 1) == 0)
                .forEach(System.out::println);
    }

    public static void even(int num) {
        if ((num & 1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        printEven(Arrays.asList(12, 30, 33, 71, 25, 265, 59, 85));
        //even();
    }
}
