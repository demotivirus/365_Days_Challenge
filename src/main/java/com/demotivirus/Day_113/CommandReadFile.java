package com.demotivirus.Day_113;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CommandReadFile implements Command {
    private Printer printer;

    @Override
    public void execute() {
        printer.readFile();
    }
}
