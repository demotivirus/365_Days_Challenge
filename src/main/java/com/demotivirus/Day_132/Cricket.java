package com.demotivirus.Day_132;

public class Cricket extends Game {
    @Override
    public void init() {
        System.out.println("Cricket game init");
    }

    @Override
    public void startGame() {
        System.out.println("Cricket game started");
    }

    @Override
    public void endGame() {
        System.out.println("Cricket game end");
    }
}
