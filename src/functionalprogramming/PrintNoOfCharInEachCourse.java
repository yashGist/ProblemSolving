package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class PrintNoOfCharInEachCourse {

    public static void printNoOfCharInEachString(List<String> courses) {
        courses.stream()
                .map(String::length)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Spring", "SpringBoot", "API", "Microservices", "AWS", "PCF", "Docker", "Kubernetes");
        printNoOfCharInEachString(courses);
    }
}
