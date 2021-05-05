package com.demotivirus.Day_132;

public abstract class Game {
    public abstract void init();
    public abstract void startGame();
    public abstract void endGame();

    public final void play(){
        init();
        startGame();
        endGame();
    }
}
