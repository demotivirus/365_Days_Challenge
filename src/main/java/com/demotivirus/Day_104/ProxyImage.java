package com.demotivirus.Day_104;

public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Some logic here");
        if (realImage == null) realImage = new RealImage(fileName);
        realImage.display();
        System.out.println("=======END======");
    }
}
