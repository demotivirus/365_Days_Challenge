package com.demotivirus.Day_123;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Original {
    private String state;
    private CareTakerStack careTakerStack = new CareTakerStack();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        careTakerStack.add(saveMemento());
    }

    public Memento saveMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }

    public void goToBackState(){
        System.out.println(careTakerStack.getLast());
    }
}
