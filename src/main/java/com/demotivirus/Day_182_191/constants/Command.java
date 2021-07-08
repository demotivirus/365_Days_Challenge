package com.demotivirus.Day_182_191.constants;

public enum Command {
    P("-P"),
    PATH("--path"),
    PACKAGE("--package"),
    HELP("--help"),
    DEMO("--demo"),
    QUIT("\\q"),
    BUG_COMMANDS_DEMO("--bugs"),
    HOT_COMMANDS("--hot"),

    ;

    Command(String command) {
        this.command = command;
    }

    private String command;

    public String getCommand() {
        return command;
    }
}
