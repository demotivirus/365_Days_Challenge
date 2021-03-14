package com.demotivirus.Day_082;

import lombok.ToString;

@ToString
public class MobilePlayer extends Player{
    public MobilePlayer(Music music) {
        super(music);
    }

    @Override
    public void listenMusic() {
        music.genre();
    }
}
