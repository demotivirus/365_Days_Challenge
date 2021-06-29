package com.demotivirus.Day_182;

public enum Commands {
    P("-P"),
    PATH("--path"),
    PACKAGE("--package"),
    HELP("--help"),
    DEMO("--demo"),
    QUIT("\\q"),

    ;

    Commands(String command) {
        this.command = command;
    }

    private String command;

    public String getCommand() {
        return command;
    }
}
