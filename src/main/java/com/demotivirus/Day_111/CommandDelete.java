package com.demotivirus.Day_111;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandDelete implements Command {
    @NonNull
    private Database database;

    @Override
    public void execute() {
        database.delete();
    }
}
