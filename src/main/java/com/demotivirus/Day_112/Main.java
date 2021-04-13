package com.demotivirus.Day_112;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User(
                new CommandStart(computer),
                new CommandReset(computer),
                new CommandStop(computer)
        );

        user.executeAllCommand();
    }
}
