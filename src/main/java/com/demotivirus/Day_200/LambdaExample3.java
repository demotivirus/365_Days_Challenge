package com.demotivirus.Day_200;

import java.util.List;
import java.util.function.Consumer;

public class LambdaExample3 {
    public static void main(String[] args) {
        List<String> words = List.of("Hello", "", "", "Lambda");
        forEach(words, System.out::println);
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
