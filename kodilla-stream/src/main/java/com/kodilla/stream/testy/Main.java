package com.kodilla.stream.testy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static long getCountEmptyStringUsingJava8(List<String> listOfStrings) {
        return listOfStrings.stream()
                .filter(String::isEmpty)
                .count();
    }

    public static long getCountLength3UsingJava8(List<String> strings) {
        return strings.stream()
                .filter(l-> l.length() == 3)
                .count();
    }

    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings) {
        return strings.stream()
                .filter(l -> !l.isEmpty())
                .collect(Collectors.toList());
    }

    public static String getMergedStringUsingJava8(List<String> strings, String s) {
        return strings.stream()
                .filter(l -> !l.isEmpty())
                .collect(Collectors.joining(s));
    }

    public static List<Integer> getSquaresJava8(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .map(l -> l*l)
                .collect(Collectors.toList());
    }


    public static Integer getMaxJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(l -> l)
                .max()
                .getAsInt();
    }


    public static Integer getMinJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(l -> l)
                .min()
                .getAsInt();
    }

    public static Integer getSumJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(l -> l)
                .sum();
    }


    public static Integer getAverageJava8(List<Integer> numbers) {
        return getSumJava8(numbers)/numbers.size();
    }
}
