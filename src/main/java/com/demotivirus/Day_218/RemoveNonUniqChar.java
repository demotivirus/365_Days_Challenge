package com.demotivirus.Day_218;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveNonUniqChar {
    private static String text = "This is a beginner to expert Spring Boot tutorial. " +
            "I have used the latest release of Spring Boot 2+ in all examples. " +
            "This tutorial gives you all the possible Spring boot features that are required to build a Spring-based " +
            "enterprise Java EE web application or RESTful APIs. " +
            "Spring Boot uses a completely new development model to make Java Development very easy by avoiding some " +
            "tedious development steps and boilerplate code and configuration";
    private static char[] chars = text.toCharArray();

    public static void main(String[] args) {
        System.out.println(removeDoubles(text));
        System.out.println(removeDoublesToo(text));
        System.out.println(removeDoublesThree(text));
    }

    private static String removeDoubles(String text) {
        StringBuilder sb = new StringBuilder();

        for (char ch : chars) {
            if (sb.indexOf(String.valueOf(ch)) == -1) //if this symbol not found in builder - he is uniq
                sb.append(ch);
        }

        return sb.toString();
    }

    private static String removeDoublesToo(String text) {
        StringBuilder sb = new StringBuilder();
        Set<Character> uniqChars = new HashSet<>();

        for (char ch : chars) {
            if (uniqChars.add(ch)) //if this char add in set - return true
                sb.append(ch);
        }

        return sb.toString();
    }

    private static String removeDoublesThree(String text) {
        return Arrays.asList(text.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
    }
}
