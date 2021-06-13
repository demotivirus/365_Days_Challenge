package com.demotivirus.Day_167;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest3 {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .forEach(System.out::println);

        Arrays.stream(new int[]{1, 2, 3, 4, 5})
                .map(n -> n * 2 + 1)
                .average()
                .ifPresent(System.out::println);

        IntStream.range(1, 10)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);
    }
}
