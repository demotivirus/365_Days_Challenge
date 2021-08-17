package com.demotivirus.Day_228_229.Tip_17;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        State state = new StartState();
        state.doAction(context);

        state = new EndState();
        state.doAction(context);
    }
}
