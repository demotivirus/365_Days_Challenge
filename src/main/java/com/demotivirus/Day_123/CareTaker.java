package com.demotivirus.Day_123;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
       return mementos.get(index);
    }
}
