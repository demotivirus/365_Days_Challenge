package com.demotivirus.Day_070;

import java.util.Random;

public class RandomNumbers {
    private static Random random = new Random();

    public static int getRandomInt(){
        return random.nextInt();
    }
}
