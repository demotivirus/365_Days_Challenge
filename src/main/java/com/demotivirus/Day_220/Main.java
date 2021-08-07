package com.demotivirus.Day_220;

public class Main {
    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .keyboard(new SimpleKeyboard())
                .mouse(new Mouse())
                .monitor(new Monitor())
                .build();

        computer.writeText("Hello from computer console");
        computer.updateKeyboard(new GamerKeyboard());
        GamerKeyboard gamerKeyboard = (GamerKeyboard) computer.getKeyboard();
        gamerKeyboard.lightsOn();
    }
}
