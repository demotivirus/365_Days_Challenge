package com.demotivirus.Day_113;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ScannerService {
    private Command readDocument;
    private Command saveDocument;

    public void executeAllDocuments(){
        readDocument.execute();
        saveDocument.execute();
    }
}
