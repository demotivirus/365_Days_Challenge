package com.demotivirus.Day_090;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Garland(new BubbleLights(new TreeImpl()));
        tree.decorate();
    }
}
