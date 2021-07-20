package com.demotivirus.Day_203;

public class Letter {
    public static String addHeader(String text) {
        return "From Paolo, Maria and Alan: " + text;
    }

    public static String addFooter(String text) {
        return text + " King Regards";
    }

    public static String checkSpelling(String text) {
        return text.replaceAll("labda", "lambda")
                .replaceAll("hewwow", "hello");
    }
}
