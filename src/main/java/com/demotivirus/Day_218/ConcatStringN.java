package com.demotivirus.Day_218;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStringN {
    public static void main(String[] args) {
        String text = "Hello my friend) ";

        System.out.println(concatRepeat(text, 10));
        System.out.println(text.repeat(3));
        System.out.println(concatRepeatTwo(text, 7));
    }

    private static String concatRepeat(String text, int repeat) {
        StringBuilder sb = new StringBuilder(text.length() * repeat);

        for (int i = 0; i <= repeat; i++) {
            sb.append(text);
        }

        return sb.toString();
    }

    private static String concatRepeatTwo(String text, int repeat) {
        return Stream.generate(() -> text)
                .limit(repeat)
                .collect(Collectors.joining());
    }
}
