package com.demotivirus.Day_123;

public class Main {
    public static void main(String[] args) {
        Original original = new Original();
        //CareTaker careTaker = new CareTaker();

        original.setState("State 1");
        original.setState("State 2");
        original.setState("State 3");
        //careTaker.add(original.saveMemento());

        original.setState("State 4");
        //careTaker.add(original.saveMemento());
        //System.out.println("Current state is " + original.getState());

        //System.out.println("First saved state is " + careTaker.getMemento(0));

        original.goToBackState();
        original.goToBackState();
        original.goToBackState();
        original.goToBackState();
        original.goToBackState();
        original.goToBackState();
    }
}
