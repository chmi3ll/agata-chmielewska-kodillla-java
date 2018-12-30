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

    public static long getCountEmptyStringUsingJava7(List<String> strings) {
        int suma = 0;
        for(String stringi : strings) {
            if (stringi.length() < 1) {
                suma++;
            }
        }
        return suma;
    }

    public static long getCountLength3UsingJava7(List<String> strings) {
        int suma = 0;
        for(String string: strings) {
           if(string.length() == 3) {
               suma++;
           }
        }
        return suma;
    }

    public static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
        List<String> newList = new ArrayList<>();
        for(String string: strings) {
            if(string.length() > 0) {
             newList.add(string);
            }
        }
        return newList;
    }

    public static String getMergedStringUsingJava7(List<String> strings, String s) {
        String jakisString = "";
        for(String string: strings) {
            if(string.length() > 0) {
                jakisString += string + s;
            }
        }
        return jakisString.substring(0,jakisString.length()-1);
    }

    public static List<Integer> getSquares(List<Integer> numbers) {
        List<Integer> lista = new ArrayList<>();
        for(Integer number: numbers){
                int square = number * number;
                if(!lista.contains(square)) {
            lista.add(square);
            }
        }
        return lista;
    }

    public static Integer getMax(List<Integer> numbers) {
        return 1;
    }

    public static Integer getMin(List<Integer> numbers) {
        return 0;
    }

    public static Integer getSum(List<Integer> numbers) {
        return 0;
    }

    public static Integer getAverage(List<Integer> numbers) {
        return 0;
    }
}
