package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class PrintList {

    public static void print(int number) {
        System.out.println(number);
    }

    public static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //numbers.forEach(PrintList::print);
        numbers.forEach(System.out::println);
    }

    public static void main(String[] args) {
        printAllNumbersInListFunctional(Arrays.asList(12, 45, 89, 56, 23, 46, 79, 4, 2, 4, 68, 89));

    }
}
