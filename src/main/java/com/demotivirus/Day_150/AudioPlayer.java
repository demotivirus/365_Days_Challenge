package com.demotivirus.Day_150;

public class AudioPlayer implements MediaPlayer {
    private MediaPlayerAdapter adapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase(AudioType.MP3.getAudioType()))
            System.out.println("Play mp3 file: " + fileName);
        else if (audioType.equalsIgnoreCase(AudioType.MP4.getAudioType()) ||
                audioType.equalsIgnoreCase(AudioType.VLC.getAudioType())) {
            adapter = new MediaPlayerAdapter(audioType);
            adapter.play(audioType, fileName);
        }
        else System.out.println("This type [" + audioType + "] not supported!");
    }
}
