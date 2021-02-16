package com.demotivirus.Day_057;

import lombok.Data;

import java.util.Random;

@Data
public class ForestGenerator {
    private static Forest forest;

    public static Forest generate(int numOfTrees){
        forest = new Forest();
        Random r = new Random();
        int generate = r.nextInt(numOfTrees);
        for (int i = 0; i < generate; i++) {
            forest.addTree(new Tree());
        }
        return forest;
    }
}
