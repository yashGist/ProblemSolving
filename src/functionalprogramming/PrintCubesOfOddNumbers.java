package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class PrintCubesOfOddNumbers {

    public static void getOddNumbersAndCubeThem(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> (number & 1) == 1)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        getOddNumbersAndCubeThem(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10));
    }
}
