package com.demotivirus.Day_150;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Play vlc file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.err.println("This type [" + fileName + "] not supported!");
    }
}
