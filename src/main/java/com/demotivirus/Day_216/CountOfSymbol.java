package com.demotivirus.Day_216;

public class CountOfSymbol {
    public static void main(String[] args) {
        String text = "This is a beginner to expert Spring Boot tutorial. " +
                "I have used the latest release of Spring Boot 2+ in all examples. " +
                "This tutorial gives you all the possible Spring boot features that are required to build a Spring-based " +
                "enterprise Java EE web application or RESTful APIs. " +
                "Spring Boot uses a completely new development model to make Java Development very easy by avoiding some " +
                "tedious development steps and boilerplate code and configuration";

        System.out.println(countConcreteSymbol(text.toLowerCase(), 'a'));
        System.out.println(countConcreteSymbolToo(text.toLowerCase(), 'a'));
        System.out.println(countConcreteSymbolThree(text.toLowerCase(), 'a'));
    }

    private static int countConcreteSymbol(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

    private static int countConcreteSymbolToo(String str, char ch) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count++;
        }

        return count;
    }

    private static long countConcreteSymbolThree(String str, char ch) {
        return str.chars()
                .filter(value -> value == ch)
                .count();
    }
}
