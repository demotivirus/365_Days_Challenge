package com.demotivirus.Day_214.Tip_06;

import com.demotivirus.Day_209_211.Tip_06.AdvancedMediaPlayer;

public class AdvancedMediaPlayerImpl implements AdvancedMediaPlayer {
    @Override
    public void playMusic(String fileName) {
        System.out.println("Play: " + fileName);
    }
}
