package com.demotivirus.Day_112;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
    private Command start, reset, stop;

    public void startComputer() {
        start.execute();
    }

    public void resetComputer() {
        reset.execute();
    }

    public void stopComputer() {
        stop.execute();
    }

    public void executeAllCommand() {
        System.out.println("Execute all commands");
        startComputer();
        resetComputer();
        stopComputer();
    }
}
