package com.demotivirus.Day_132;

public class Football extends Game {
    @Override
    public void init() {
        System.out.println("Football game init");
    }

    @Override
    public void startGame() {
        System.out.println("Football game started");
    }

    @Override
    public void endGame() {
        System.out.println("Football game end");
    }
}
