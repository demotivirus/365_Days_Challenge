package com.demotivirus.Day_232;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayFromStream {
    public static void main(String[] args) {
        String[] arr = {"One", "Two", "Three", "Four", "Five"};
        Stream<String> stream = Arrays.stream(arr, 0, 4);
        stream = Stream.of(arr); //equal

        String[] arr2 = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(arr2));
    }
}
