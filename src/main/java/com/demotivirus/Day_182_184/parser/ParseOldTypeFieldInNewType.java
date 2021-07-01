package com.demotivirus.Day_182_184.parser;

public class ParseOldTypeFieldInNewType {
    public static String parse(String oldType) { //todo 30.06 - add many types
        switch (oldType.toLowerCase()) {
            case "varchar":
            case "char":
            case "varchar)":
            case "char)":
                return "String";
            case "int":
            case "int)":
                return "int";
            case "void": return "void";
            default: return oldType;
        }
    }
}
