package com.demotivirus.Day_217;

import java.util.regex.Pattern;

public class CountStringInString {
    public static void main(String[] args) {
        String text = "This is a beginner to expert Spring Boot tutorial. " +
                "I have used the latest release of Spring Boot 2+ in all examples. " +
                "This tutorial gives you all the possible Spring boot features that are required to build a Spring-based " +
                "enterprise Java EE web application or RESTful APIs. " +
                "Spring Boot uses a completely new development model to make Java Development very easy by avoiding some " +
                "tedious development steps and boilerplate code and configuration";

        System.out.println(count(text, "to"));
        System.out.println(countToo(text, "the"));
    }

    private static int count(String text, String findingWord) {
        int position = 0, count = 0, n = findingWord.length();

        while ((position = text.indexOf(findingWord, position)) != -1) {
            position = position + n;
            count++;
        }

        return count;
    }

    private static int countToo(String text, String findingWord) {
        int result = text.split(Pattern.quote(findingWord), -1).length - 1;
        return result < 0 ? 0 : result;
    }
}
