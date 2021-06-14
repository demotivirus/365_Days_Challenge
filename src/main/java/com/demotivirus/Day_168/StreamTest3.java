package com.demotivirus.Day_168;

import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        Stream.of("b1", "a1", "c3", "hello", "anyString")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("------------- map: " + s);
                    return s.toLowerCase();
                })
                .forEach(s -> {
                    System.out.println("forEach: " + s);
                });
    }
}
