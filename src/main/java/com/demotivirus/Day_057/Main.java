package com.demotivirus.Day_057;

public class Main {
    public static void main(String[] args) {
        Forest forest = ForestGenerator.generate(100);
        System.out.println(forest.getTrees());
    }
}
