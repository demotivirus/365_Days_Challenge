package com.demotivirus.Day_217;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMostPopularSymbol {
    public static void main(String[] args) {
        String text = "This is a beginner to expert Spring Boot tutorial. " +
                "I have used the latest release of Spring Boot 2+ in all examples. " +
                "This tutorial gives you all the possible Spring boot features that are required to build a Spring-based " +
                "enterprise Java EE web application or RESTful APIs. " +
                "Spring Boot uses a completely new development model to make Java Development very easy by avoiding some " +
                "tedious development steps and boilerplate code and configuration";

        System.out.println(findMostPopularSymbol(text));
        System.out.println(findMostPopularSymbolToo(text));
        System.out.println(findMostPopularSymbolThree(text));
    }

    private static Map<Character, Integer> findMostPopularSymbol(String text) {
        Map<Character, Integer> result = new HashMap<>();
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];
            if (!Character.isWhitespace(currentChar)) { //ignore whitespaces
                Integer counter = result.get(currentChar);
                if (counter == null)
                    result.put(currentChar, 1);
                else result.put(currentChar, ++counter);
            }
        }

        int maxOccurrences = Collections.max(result.values());
        char maxCharacter = Character.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : result.entrySet()) { //find in map
            if (entry.getValue() == maxOccurrences)
                maxCharacter = entry.getKey();
        }

        return Map.of(maxCharacter, maxOccurrences);
    }

    private static Map<Character, Integer> findMostPopularSymbolToo(String text) {
        int maxOccurrences = -1;
        char maxChar = Character.MIN_VALUE;
        char[] chars = text.toCharArray();
        int[] asciiCodes = new int[256];

        for (char ch : chars) {
            if (!Character.isWhitespace(ch)) { //ignore whitespaces
                int code = ch;
                asciiCodes[code]++; //add in array 1 and counting
                if (asciiCodes[code] > maxOccurrences) {
                    maxOccurrences = asciiCodes[code];
                    maxChar = ch;
                }
            }
        }

        return Map.of(maxChar, maxOccurrences);
    }

    private static Map<Character, Long> findMostPopularSymbolThree(String text) {
        return text.chars()
                .filter(c -> Character.isWhitespace(c) == false) //ignore whitespaces
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(m -> Map.of(m.getKey(), m.getValue()))
                .orElse(Map.of(Character.MIN_VALUE, -1L));
    }
}
