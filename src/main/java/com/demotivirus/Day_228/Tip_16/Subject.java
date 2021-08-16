package com.demotivirus.Day_228.Tip_16;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void setState(int state) {
        this.state = state;
        notifyAllObservers(); //use method in all subscriber classes
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public int getState() {
        return state;
    }
}
