package com.demotivirus.Day_200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LambdaExample4 {
    public static void main(String[] args) {
        List<Integer> list = map(Arrays.asList("hello", "from", "lambda"), s -> s.length());
        System.out.println(list);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }
}
