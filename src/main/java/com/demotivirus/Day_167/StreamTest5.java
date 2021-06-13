package com.demotivirus.Day_167;

import java.util.stream.Stream;

public class StreamTest5 {
    public static void main(String[] args) {
        Stream.of("hello", "my", "young", "friends")
                .filter(s -> {
                    System.out.println("Filter " + s);
                    return true;
                })
                .forEach(s -> System.out.println("Foreach " + s));
    }
}
