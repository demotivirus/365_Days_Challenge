package com.demotivirus.Day_217;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveCharacter {
    public static void main(String[] args) {
        String text = "This is a beginner to expert Spring Boot tutorial. " +
                "I have used the latest release of Spring Boot 2+ in all examples. " +
                "This tutorial gives you all the possible Spring boot features that are required to build a Spring-based " +
                "enterprise Java EE web application or RESTful APIs. " +
                "Spring Boot uses a completely new development model to make Java Development very easy by avoiding some " +
                "tedious development steps and boilerplate code and configuration";

        System.out.println(removeCharacter(text, 'o'));
        System.out.println();
        System.out.println(removeCharacterToo(text, 'a'));
        System.out.println();
        System.out.println(removeCharacterThree(text, 'T'));
    }

    private static String removeCharacter(String text, char ch) {
        return text.replaceAll(Pattern.quote(String.valueOf(ch)), "");
    }

    private static String removeCharacterToo(String text, char ch) {
        StringBuilder sb = new StringBuilder();
        char[] chars = text.toCharArray(); //get all symbols for cycle

        for (char c : chars) {
            if (c != ch)
                sb.append(c);
        }

        return sb.toString();
    }

    private static String removeCharacterThree(String text, char ch) {
        return text.chars()
                .filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }
}
