package com.demotivirus.Day_208;

import java.util.stream.IntStream;

public class StreamExample7 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100) //1 - 100
                .filter(n -> n % 2 == 0);
        System.out.println(intStream.count());
    }
}
