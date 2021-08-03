package com.demotivirus.Day_216;

import java.util.Locale;

public class FindFirstUniqSymbol {
    private static final int ASCII_CODES = 256;

    public static void main(String[] args) {
//        String text = "This is a beginner to expert Spring Boot tutorial. " +
//                "I have used the latest release of Spring Boot in all examples. " +
//                "This tutorial gives you all the possible Spring boot features that are required to build a Spring based " +
//                "enterprise Java EE web application or RESTful APIs. " +
//                "Spring Boot uses a completely new development model to make Java Development very easy by avoiding some " +
//                "tedious development steps and boilerplate code and configuration";

        String text = "abbcaaaa";

        System.out.println(findFirstUniqChar(text.toLowerCase(Locale.ROOT)));
    }

    private static char findFirstUniqChar(String str) {
        int[] flags = new int[ASCII_CODES];

        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1; //init array
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //get symbol
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2; //if symbol non uniq
            }
        }

        int position = Integer.MAX_VALUE;

        for (int i = 0; i < ASCII_CODES; i++) {
            if (flags[i] >= 0)
                position = Math.min(position, flags[i]); //find minimal uniq symbol
        }

        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
    }
}
