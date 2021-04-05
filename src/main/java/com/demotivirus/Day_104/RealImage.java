package com.demotivirus.Day_104;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        System.out.println("Load file from disc");
    }

    @Override
    public void display() {
        System.out.println("Display realImage");
    }
}
