package com.demotivirus.Day_168;

import java.util.stream.Stream;

public class StreamTest1 {
    public static void main(String[] args) {
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> { //find first element who equals
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
    }
}
