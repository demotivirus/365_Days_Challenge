package com.demotivirus.Day_113;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner();

        PrinterService printerService =
                new PrinterService(new CommandReadFile(printer), new CommandPrintFile(printer));
        printerService.executeAllCommands();

        ScannerService scannerService =
                new ScannerService(new CommandReadDocument(scanner), new CommandSaveDocument(scanner));
        scannerService.executeAllDocuments();
    }
}
