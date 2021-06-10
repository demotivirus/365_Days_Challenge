package com.demotivirus.Day_164;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = DataBaseFactory.create("PostgreSQL");
        dataBase.execute(Command.SELECT);
    }
}
