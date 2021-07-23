package com.demotivirus.Day_206;

import java.util.Arrays;
import java.util.List;

public class StreamExamples7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 7, 12);
        numbers.stream().map(n -> n * n).forEach(System.out::println); //squares
    }
}
