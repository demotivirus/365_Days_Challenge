package com.demotivirus.Day_228.Tip_16;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(16); //send message from all observers
        System.out.println("===================");
        subject.setState(29);
    }
}
