package com.demotivirus.Day_182_189.parser;

public class ParseCommandInText {
    public static String parse(String text) {
        switch (text.toLowerCase()) {
            case "--psvm": return "\tpublic static void main(String[] args) ";
            default: return "\tprivate ".concat(text);
        }
    }
}
