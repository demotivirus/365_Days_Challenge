package com.demotivirus.Day_182_187.constants;

public enum Command {
    P("-P"),
    PATH("--path"),
    PACKAGE("--package"),
    HELP("--help"),
    DEMO("--demo"),
    QUIT("\\q"),
    BUG_COMMANDS_DEMO("--bugs"),

    ;

    Command(String command) {
        this.command = command;
    }

    private String command;

    public String getCommand() {
        return command;
    }
}
