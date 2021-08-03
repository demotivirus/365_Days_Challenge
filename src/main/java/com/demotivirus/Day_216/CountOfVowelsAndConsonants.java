package com.demotivirus.Day_216;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountOfVowelsAndConsonants {
    private static final Set<Character> vowelsSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static void main(String[] args) {
        String text = "This is a beginner to expert Spring Boot tutorial. " +
                "I have used the latest release of Spring Boot 2+ in all examples. " +
                "This tutorial gives you all the possible Spring boot features that are required to build a Spring-based " +
                "enterprise Java EE web application or RESTful APIs. " +
                "Spring Boot uses a completely new development model to make Java Development very easy by avoiding some " +
                "tedious development steps and boilerplate code and configuration";

        System.out.println(count(text.toLowerCase()));

        text = "Hello world";
        System.out.println(count(text.toLowerCase()));

        System.out.println(countToo(text.toLowerCase()));
    }

    private static Pair<Integer, Integer> count(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); // get symbol
            if (vowelsSet.contains(ch))
                vowels++;
            else if (ch >= 'a' && ch <= 'z')
                consonants++;
        }

        return Pair.of(vowels, consonants);
    }

    private static Pair<Long, Long> countToo(String text) {
        long vowels = text.chars()
                .filter(c -> vowelsSet.contains((char) c))
                .count();

        long consonants = text.chars()
                .filter(c -> !vowelsSet.contains((char) c))
                .filter(c -> (c >= 'a' && c <= 'z'))
                .count();

        return Pair.of(vowels, consonants);
    }
}
