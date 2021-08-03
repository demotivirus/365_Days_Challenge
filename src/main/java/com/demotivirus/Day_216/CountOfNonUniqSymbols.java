package com.demotivirus.Day_216;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfNonUniqSymbols {
    public static void main(String[] args) {
        String text = "This is a beginner to expert Spring Boot tutorial. " +
                "I have used the latest release of Spring Boot 2+ in all examples. " +
                "This tutorial gives you all the possible Spring boot features that are required to build a Spring-based " +
                "enterprise Java EE web application or RESTful APIs. " +
                "Spring Boot uses a completely new development model to make Java Development very easy by avoiding some " +
                "tedious development steps and boilerplate code and configuration";

        Map<Character, Integer> characterIntegerMap = countDuplicateNumbers(text);
        System.out.println(characterIntegerMap);
        System.out.println(countDuplicateNumbersToo(text));
    }

    private static Map<Character, Integer> countDuplicateNumbers(String text) {
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            result.compute(ch, (k, v) -> v == null ? 1 : ++v); //if key is empty -> key = 1 else key++
        }
        return result;
    }

    private static Map<Character, Long> countDuplicateNumbersToo(String text) {
        return text.chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));
    }
}
