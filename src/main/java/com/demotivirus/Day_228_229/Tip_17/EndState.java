package com.demotivirus.Day_228_229.Tip_17;

import lombok.ToString;

@ToString
public class EndState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("In end state"); //save this state
    }
}
