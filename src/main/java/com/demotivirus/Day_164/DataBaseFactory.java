package com.demotivirus.Day_164;

import java.util.Locale;

public class DataBaseFactory {
    public static DataBase create(String name) {
        DataBase dataBase = null;
        switch (name.toLowerCase()) {
            case "postgresql" -> dataBase = new PostgreSQL();
            default -> dataBase = new PostgreSQL();
        }
        return dataBase;
    }
}
