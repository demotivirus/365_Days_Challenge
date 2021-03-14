package com.demotivirus.Day_082;

import lombok.ToString;

@ToString
public abstract class Player {
    protected Music music;

    public Player(Music music){
        this.music = music;
    }

    public abstract void listenMusic();
}
