package com.demotivirus.Day_228.Tip_15;

import lombok.Data;

@Data
public class Original {
    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
