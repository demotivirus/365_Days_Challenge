package com.demotivirus.Day_216;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinStringWithDelimiter {
    public static void main(String[] args) {
        String text = "Hello how are you?";
        String[] split = text.split(" ");
        System.out.println(join(',', split));
    }

    private static String join(char delimiter, String... args) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        for (int j = 0; j < args.length; j++) {
            sb.append(args[j]).append(delimiter);
        }

        //sb.append(args[i]); //append last symbol without delimiter
        return sb.toString();
    }

    private static String joinToo(char delimiter, String... args) {
        return Arrays.stream(args, 0, args.length)
                .collect(Collectors.joining(String.valueOf(delimiter)));
    }
}
