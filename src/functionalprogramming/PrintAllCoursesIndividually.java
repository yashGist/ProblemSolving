package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class PrintAllCoursesIndividually {

    public static void printList(List<String> list) {
        list.forEach(System.out::println);
    }

    public static void printCoursesContainingSpring(List<String> list) {
        list.stream()
                .filter(lists -> lists.contains("Spring"))
                .forEach(System.out::println);
    }

    public static void printCoursesWhoseLengthIsGreaterThan4(List<String> lists) {
        lists.stream()
                .filter(list -> list.length()>4)
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Spring", "SpringBoot", "API", "Microservices", "AWS", "PCF", "Docker", "Kubernetes");
        //printList(courses);
        //printCoursesContainingSpring(courses);
        printCoursesWhoseLengthIsGreaterThan4(courses);
    }
}
