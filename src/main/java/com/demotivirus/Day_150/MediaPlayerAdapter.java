package com.demotivirus.Day_150;

public class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(String audioType) {
        if (audioType.equalsIgnoreCase(AudioType.MP4.getAudioType()))
            advancedMediaPlayer = new Mp4Player();
        else if (audioType.equalsIgnoreCase(AudioType.VLC.getAudioType()))
            advancedMediaPlayer = new VlcPlayer();
        else System.err.println("Audio type not supported!");
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase(AudioType.MP4.getAudioType()))
            advancedMediaPlayer.playMp4(fileName);
        else if (audioType.equalsIgnoreCase(AudioType.VLC.getAudioType()))
            advancedMediaPlayer.playVlc(fileName);
        else System.err.println("Audio type not supported!");
    }
}
