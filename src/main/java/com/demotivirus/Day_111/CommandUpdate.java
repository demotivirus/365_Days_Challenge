package com.demotivirus.Day_111;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommandUpdate implements Command {
    @NonNull
    private Database database;

    @Override
    public void execute() {
        database.update();
    }
}
