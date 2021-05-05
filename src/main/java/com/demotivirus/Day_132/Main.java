package com.demotivirus.Day_132;

public class Main {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();

        game = new Tennis();
        game.play();
    }
}
