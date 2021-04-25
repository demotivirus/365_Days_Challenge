package com.demotivirus.Day_123;

import java.util.Stack;

public class CareTakerStack {
    private Stack<Memento> mementos = new Stack<>();

    public void add(Memento memento) {
        mementos.push(memento);
    }

    public Memento getLast() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        }
        else return null;
    }
}
