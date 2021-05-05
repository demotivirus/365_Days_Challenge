package com.demotivirus.Day_132;

public class Tennis extends Game {
    @Override
    public void init() {
        System.out.println("Tennis game init");
    }

    @Override
    public void startGame() {
        System.out.println("Tennis game started");
    }

    @Override
    public void endGame() {
        System.out.println("Tennis game end");
    }
}
