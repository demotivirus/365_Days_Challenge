package com.demotivirus.Day_238;

import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class LombokForStatic {
    private final int randomCode = new Random().nextInt(Integer.MAX_VALUE);

    public static String append(String input) {
        return input + randomCode;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(LombokForStatic.append("88"));
        }
    }
}
