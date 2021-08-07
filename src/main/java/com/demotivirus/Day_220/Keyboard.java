package com.demotivirus.Day_220;

import lombok.ToString;

@ToString
public abstract class Keyboard {
    public void writeText(String text) {
        System.out.println("Write: " + text);
    }
}
