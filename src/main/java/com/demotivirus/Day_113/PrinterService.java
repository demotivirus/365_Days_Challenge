package com.demotivirus.Day_113;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrinterService {
    private Command readFile;
    private Command printFile;

    public void executeAllCommands(){
        readFile.execute();
        printFile.execute();
    }
}
