package com.demotivirus.Day_150;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Login horizon");
        audioPlayer.play("mp4", "LoTR 1");
        audioPlayer.play("vlc", "Bombs hund book");
        audioPlayer.play("avi", "Some tv show...");
    }
}
