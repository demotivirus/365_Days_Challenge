package com.demotivirus.Day_156;

import java.util.function.Function;

public class HighOrderFunction {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Function<Integer, Integer> square = t -> t * t;
        Function<Integer, Integer> cube = t -> t * t * t;
        Function<String, String> concat = t -> t.concat(t);
        Function<Integer, String> concatToInteger = t -> t.toString();

        printFunction(square, 10);
        printFunction(cube, 10);
        printFunction(concatToInteger, 10);
        printFunction(concat, "Good");
    }

    private static <T, R> void printFunction(Function<T, R> function, T t) {
        System.out.println(function.apply(t));
    }
}
