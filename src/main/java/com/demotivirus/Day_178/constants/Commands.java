package com.demotivirus.Day_178.constants;

public enum Commands {
    P("-P"),
    PATH("--path"),
    PACKAGE("--package"),
    HELP("--help"),

    ;

    Commands(String command) {
        this.command = command;
    }

    private String command;

    public String getCommand() {
        return command;
    }
}
