package com.demotivirus.Day_113;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
public class CommandReadDocument implements Command {
    private Scanner scanner;

    @Override
    public void execute() {
        scanner.readDocument();
    }
}
