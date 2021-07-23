package com.demotivirus.Day_206;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "my", "dear", "friends");
        List<Integer> lengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);
    }
}
