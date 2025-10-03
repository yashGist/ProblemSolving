package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class SquareOfEachElement {

    public static void printSquares(List<Integer> numbers) {
        numbers.stream()
                .map(number -> number * number)  //needs mapping
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        printSquares(Arrays.asList(1, 2, 3, 6, 4, 5, 8));
    }
}
