package com.demotivirus.Day_203;

import java.util.function.Function;

public class LambdaExample7 {
    public static void main(String[] args) {
        Function<String, String> addHeader = Letter::addHeader;
        Function<String, String> transform = addHeader.andThen(Letter::checkSpelling).andThen(Letter::addFooter);
        System.out.println(transform.apply("Hewwo from my little world in LA"));
    }
}
