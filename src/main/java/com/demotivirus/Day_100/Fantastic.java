package com.demotivirus.Day_100;

public class Fantastic implements Genre {
    @Override
    public void printGenre() {
        System.out.println("Fantastic genre " + this.hashCode());
    }
}
