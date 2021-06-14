package com.demotivirus.Day_168;

import java.util.stream.Stream;

public class StreamTest5 {
    public static void main(String[] args) {
        Stream.of("b1", "a1", "c3", "hello", "anyString")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .sorted((s1, s2) -> {
                    System.out.printf("sort:             %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> {
                    System.out.println("----------------- forEach: " + s);
                });
    }
}
