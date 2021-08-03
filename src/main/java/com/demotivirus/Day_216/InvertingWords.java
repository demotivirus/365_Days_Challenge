package com.demotivirus.Day_216;

public class InvertingWords {
    public static void main(String[] args) {
        String text = "This is a beginner to expert Spring Boot tutorial. " +
                "I have used the latest release of Spring Boot 2+ in all examples. " +
                "This tutorial gives you all the possible Spring boot features that are required to build a Spring-based " +
                "enterprise Java EE web application or RESTful APIs. " +
                "Spring Boot uses a completely new development model to make Java Development very easy by avoiding some " +
                "tedious development steps and boilerplate code and configuration";

        System.out.println(reverse(text));
        System.out.println();
        System.out.println(reverseToo(text));
    }

    private static String reverse(String str) {
        String[] split = str.split(" "); //split text for words

        StringBuilder reversedString = new StringBuilder();

        for (String word : split) {
            StringBuilder reversedWord = new StringBuilder();

            for (int i = word.length() -1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }

            reversedString.append(reversedWord).append(" ");
        }

        return reversedString.toString().trim();
    }

    private static String reverseToo(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
