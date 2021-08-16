package com.demotivirus.Day_228.Tip_06;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3") || audioType.equals("vlc"))
           advancedMediaPlayer.playMusic(fileName);
        else System.out.println("Type not supported");
    }
}
