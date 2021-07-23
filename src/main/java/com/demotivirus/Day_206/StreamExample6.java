package com.demotivirus.Day_206;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample6 {
    public static void main(String[] args) {
        //List<String> words = Arrays.asList("Hello", "worlds", "from", "lambdas"); //not work correctly
        //String[] words = {"hello", "words", "from", "lambdas"}; //not work correctly too
        //Stream<String> stringStream = Arrays.stream(words);

//        List<String[]> collect = stringStream
//                .map(word -> word.split(""))
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(collect);
        List<String> words = Arrays.asList("hello", "worlds", "from", "lambdas");
        List<String> uniqueChars = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueChars);
    }
}
