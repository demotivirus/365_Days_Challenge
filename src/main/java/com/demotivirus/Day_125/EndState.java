package com.demotivirus.Day_125;

public class EndState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in end state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "End state";
    }
}
