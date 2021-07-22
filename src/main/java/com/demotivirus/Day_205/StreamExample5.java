package com.demotivirus.Day_205;

import java.util.Arrays;
import java.util.List;

public class StreamExample5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 7, 5, 9, 3, 3, 9, 1, 2, 6, 8, 6, 8);
        numbers.stream().filter(i -> i % 2 == 0)
                //.distinct()
                .forEach(System.out::println);
        System.out.println("============");
        numbers.stream().filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }
}
