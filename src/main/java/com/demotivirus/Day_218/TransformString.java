package com.demotivirus.Day_218;

import java.util.stream.Stream;

public class TransformString {
    public static void main(String[] args) {
        String resultMap = Stream.of("hello")
                .map(s -> s.concat(" world"))
                .findFirst()
                .get();
        System.out.println(resultMap);

        String transform = "hello".transform(s -> s.concat(" world"));
        System.out.println(transform);

        resultMap = Stream.of("gooooool! ")
                .map(String::toUpperCase)
                .map(s -> s.repeat(2))
                .map(s -> s.replaceAll("O", "OOO"))
                .findFirst()
                .get();
        System.out.println(resultMap);

        transform = "gooooool! ".transform(String::toUpperCase)
                .transform(s -> s.repeat(2))
                .transform(s -> s.replaceAll("O", "OOO"));
        System.out.println(transform);
    }
}
