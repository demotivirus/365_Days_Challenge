package com.demotivirus.Day_167;

import java.util.Arrays;
import java.util.List;

public class StreamTest1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "my", "young", "friends");

        words.stream()
                .map(String::toUpperCase);
        System.out.println(words);

        words.stream()
                .map(x -> x.length())
                .forEach(System.out::println);

        words.stream()
                .filter(x -> x.startsWith("h"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
