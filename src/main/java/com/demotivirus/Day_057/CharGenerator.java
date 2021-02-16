package com.demotivirus.Day_057;

import java.util.Random;

public class CharGenerator {
    private static Random random;
    private static StringBuilder stringBuilder;
    private static char[] letters;

    public static String generate(int numOfChars){
        initLetters();
        stringBuilder = new StringBuilder();
        random = new Random();

        for (int i = 0; i < numOfChars; i++) {
            int letter = random.nextInt(25);
            stringBuilder.append(letters[letter]);
        }

        return stringBuilder.toString();
    }

    private static void initLetters(){
        letters = new char[25];
        int letterBIG = 65;
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) letterBIG;
            letterBIG++;
        }
    }
}
