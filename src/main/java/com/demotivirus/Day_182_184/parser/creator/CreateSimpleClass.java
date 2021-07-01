package com.demotivirus.Day_182_184.parser.creator;

import com.demotivirus.Day_182_184.text.GenerateSimpleTextInFile;
import com.demotivirus.Day_182_184.util.CreateJavaFile;

public class CreateSimpleClass {
    public static void create(String textWithoutKeyWord) {
        String stringWithoutLastSymbol = textWithoutKeyWord.substring(0, textWithoutKeyWord.length() - 1);
        CreateJavaFile.create(stringWithoutLastSymbol);
        GenerateSimpleTextInFile.generate(stringWithoutLastSymbol);
        System.out.println("create table: " + stringWithoutLastSymbol);
    }
}
