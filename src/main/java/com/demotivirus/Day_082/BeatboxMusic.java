package com.demotivirus.Day_082;

import lombok.ToString;

@ToString
public class BeatboxMusic implements Music {
    @Override
    public void genre() {
        System.out.println("Play beatbox!");
    }
}
