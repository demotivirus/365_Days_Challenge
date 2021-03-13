package com.demotivirus.Day_082;

import lombok.ToString;

@ToString
public class ClassicMusic implements Music{
    @Override
    public void genre() {
        System.out.println("Play classic music");
    }
}
