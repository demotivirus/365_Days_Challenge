package com.demotivirus.Day_150;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("This type [" + fileName + "] not supported!");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Play mp4 file: " + fileName);
    }
}
