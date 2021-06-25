package com.demotivirus.Day_179.constants;

public enum Commands {
    P("-P"),
    PATH("--path"),
    PACKAGE("--package"),
    HELP("--help"),
    DEMO("--demo")
    ;

    Commands(String command) {
        this.command = command;
    }

    private String command;

    public String getCommand() {
        return command;
    }
}
