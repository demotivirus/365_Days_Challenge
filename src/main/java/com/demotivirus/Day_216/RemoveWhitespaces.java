package com.demotivirus.Day_216;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        String text = "This is a beginner to expert Spring Boot tutorial. " +
                "I have used the latest release of Spring Boot 2+ in all examples. " +
                "This tutorial gives you all the possible Spring boot features that are required to build a Spring-based " +
                "enterprise Java EE web application or RESTful APIs. " +
                "Spring Boot uses a completely new development model to make Java Development very easy by avoiding some " +
                "tedious development steps and boilerplate code and configuration";

        System.out.println(removeWhiteSpaces(text));
    }

    private static String removeWhiteSpaces(String text) {
        return text.replaceAll(" ", "");
    }
}
