package com.demotivirus.Day_167;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest2 {
    public static void main(String[] args) {
        Arrays.asList("hello1", "hello2", "hello3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        Stream.of("hello1", "hello2", "hello3")
                .findFirst()
                .ifPresent(System.out::println);
    }
}
