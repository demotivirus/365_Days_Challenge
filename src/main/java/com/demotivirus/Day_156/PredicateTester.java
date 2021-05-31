package com.demotivirus.Day_156;

import java.util.function.Predicate;

public class PredicateTester {
    public static void main(String[] args) {
        Predicate<String> hasName = text -> text.contains("name");
        Predicate<String> hasPass = pass -> pass.contains("password");

        Predicate<String> hasSomething = hasName.and(hasPass);

        String queryString = "name=test;password=test";
        System.out.println(hasSomething.test(queryString));
    }
}
