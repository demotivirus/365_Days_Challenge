package com.demotivirus.Day_200;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample2 {
    public static void main(String[] args) {
        List<String> words = List.of("Hello", "", "", "Lambda");
        Predicate<String> isNotEmpty = p -> !p.isEmpty();
        List nonEmpty = filter(words, isNotEmpty);
        System.out.println(nonEmpty);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t))
                result.add(t);
        }
        return result;
    }
}
