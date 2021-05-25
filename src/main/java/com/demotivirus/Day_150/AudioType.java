package com.demotivirus.Day_150;

public enum AudioType {
    MP3("mp3"),
    VLC("vlc"),
    MP4("mp4");

    private AudioType(String audioType) {
        this.audioType = audioType;
    }

    private final String audioType;

    public String getAudioType() {
        return audioType;
    }
}
