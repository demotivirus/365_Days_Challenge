package com.demotivirus.Day_182_186.parser;

public class ParseOldTypeFieldInNewType {
    public static String parse(String oldType) { //todo 30.06 - add many types
        switch (oldType.toLowerCase()) {
            case "varchar":
            case "char":
                return "String";
            case "int":
            case "integer":
                return "int";
            case "long":
            case "bigint":
                return "long";
            case "double":
            case "decimal":
            case "numeric":
                return "double";
            case "smallint": return "short";
            case "float": return "float";
            case "void": return "void";
            default: return oldType;
        }
    }
}
