package com.demotivirus.Day_156;

import java.util.function.Function;

public class FunctionTester {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = f -> f * 7;
        Function<Integer, String> function2 = f -> f + "Go";
        Function<Integer, Integer> function3 = f -> f + 5;

        Function<Integer, Integer> function4 = function1.compose(function3);
        Function<Integer, Integer> function5 = function1.andThen(function3);

        System.out.println(function4.apply(10));
        System.out.println(function5.apply(10));
    }
}
