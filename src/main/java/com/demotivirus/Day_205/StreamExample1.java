package com.demotivirus.Day_205;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Future", "Stream", "API");
        Stream<String> stream = words.stream();
        stream.forEach(System.out::println);
        stream.forEach(System.out::println); //error this
    }
}
