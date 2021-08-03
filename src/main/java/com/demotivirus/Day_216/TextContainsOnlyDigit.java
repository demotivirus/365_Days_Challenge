package com.demotivirus.Day_216;

public class TextContainsOnlyDigit {
    public static void main(String[] args) {
        String text = "738920O";

        System.out.println(containsOnlyDigit(text));
        System.out.println(containsOnlyDigitToo(text));
        System.out.println(containsOnlyDigitThree(text));
    }

    private static boolean containsOnlyDigit(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i)))
                return false;
        }
        return true;
    }

    private static boolean containsOnlyDigitToo(String text) {
        return !text.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }

    private static boolean containsOnlyDigitThree(String text) {
        return text.matches("[\\d]+");
    }
}
