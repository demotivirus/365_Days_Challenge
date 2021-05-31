package com.demotivirus.Day_156;

import java.util.function.Supplier;

public class EagerLazyTester {
    public static void main(String[] args) {
        String queryString = "password=test";

        System.out.println(checkInEagerWay(hasName(queryString), hasPass(queryString)));
        //System.out.println(checkInLazy(hasName(hasName()), hasPass(queryString)));
    }

    private static String checkInEagerWay(boolean res1, boolean res2) {
        return (res1 && res2) ? "passed" : "failed";
    }

    private static boolean hasName(String queryString) {
        System.out.println("Logging name: ");
        return queryString.contains("name");
    }

    private static boolean hasPass(String queryString) {
        System.out.println("Logging pass: ");
        return queryString.contains("pass");
    }

    private static String checkInLazy(Supplier<Boolean> res1, Supplier<Boolean> res2) {
        return (res1.get() && res2.get()) ? "passed" : "failed";
    }
}
