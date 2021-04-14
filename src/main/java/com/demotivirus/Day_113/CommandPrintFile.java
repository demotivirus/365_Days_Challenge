package com.demotivirus.Day_113;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CommandPrintFile implements Command{
    private Printer printer;

    @Override
    public void execute() {
        printer.printFile();
    }
}
