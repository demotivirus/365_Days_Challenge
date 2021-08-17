package com.demotivirus.Day_228_229.Tip_17;

import lombok.ToString;

@ToString
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("In start state");
        context.setState(this); //save this state
    }
}
