package com.demotivirus.Day_167;

import java.util.stream.Stream;

public class StreamTest4 {
    public static void main(String[] args) {
        Stream.of("hello", "my", "stream", "world")
                .map(s -> s.substring(1))
                .forEach(System.out::println);

         Stream.of(1.0, 2.0, 3.0)
                 .mapToInt(Double::intValue)
                 .mapToObj(i -> "a" + i)
                 .forEach(System.out::println);
    }
}
