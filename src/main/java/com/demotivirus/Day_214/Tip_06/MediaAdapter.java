package com.demotivirus.Day_214.Tip_06;

import com.demotivirus.Day_209_211.Tip_06.AdvancedMediaPlayer;
import com.demotivirus.Day_209_211.Tip_06.MediaPlayer;

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
