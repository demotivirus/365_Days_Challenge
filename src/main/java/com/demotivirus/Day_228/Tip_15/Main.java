package com.demotivirus.Day_228.Tip_15;

public class Main {
    public static void main(String[] args) {
        Original original = new Original();
        CareTaker careTaker = new CareTaker();

        original.setState("State 1");
        original.setState("State 2");
        careTaker.add(original.saveStateToMemento());

        original.setState("State 3");
        original.setState("State 4");
        careTaker.add(original.saveStateToMemento());

        System.out.println(original.getState());

        original.getStateFromMemento(careTaker.get(0));
        System.out.println(original.getState());

        original.getStateFromMemento(careTaker.get(1));
        System.out.println(original.getState());
    }
}
