package com.demotivirus.Day_232;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        int[] integers = {2, 3, 4, 1, 5};
        IntStream intStream = Arrays.stream(integers);
        intStream = IntStream.of(integers); //equal

        intStream = IntStream.range(0, integers.length);
        intStream = IntStream.rangeClosed(0, integers.length);

        intStream.forEach(System.out::println);

        intStream = IntStream.of(integers); //put arr to stream because stream is closed here
        int[] arr = intStream.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
