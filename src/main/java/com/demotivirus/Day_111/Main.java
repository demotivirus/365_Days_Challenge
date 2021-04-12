package com.demotivirus.Day_111;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        DatabaseService service = new DatabaseService(
                new CommandUpdate(database),
                new CommandInsert(database),
                new CommandRead(database),
                new CommandDelete(database));
        service.getAllCommands();
    }
}
