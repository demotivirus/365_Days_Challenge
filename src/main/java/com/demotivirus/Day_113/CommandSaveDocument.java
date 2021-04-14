package com.demotivirus.Day_113;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CommandSaveDocument implements Command {
    private Scanner scanner;

    @Override
    public void execute() {
        scanner.saveDocument();
    }
}
