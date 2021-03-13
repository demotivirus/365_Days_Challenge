package com.demotivirus.Day_082;

import lombok.ToString;

@ToString
public class DjPlayer extends Player {
    public DjPlayer(Music music) {
        super(music);
    }

    @Override
    public void listenMusic() {
        music.genre();
    }
}
