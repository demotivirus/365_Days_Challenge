package com.demotivirus.Day_112;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandStart implements Command {
    @NonNull
    private Computer computer;

    @Override
    public void execute() {
        computer.start();
    }
}
