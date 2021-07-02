package com.demotivirus.Day_182_185.constants;

public enum Command {
    P("-P"),
    PATH("--path"),
    PACKAGE("--package"),
    HELP("--help"),
    DEMO("--demo"),
    QUIT("\\q"),

    ;

    Command(String command) {
        this.command = command;
    }

    private String command;

    public String getCommand() {
        return command;
    }
}
