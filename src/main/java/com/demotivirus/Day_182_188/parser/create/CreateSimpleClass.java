package com.demotivirus.Day_182_188.parser.create;

import com.demotivirus.Day_182_188.creator.CreateJavaFile;
import com.demotivirus.Day_182_188.text.GenerateSimpleTextInFile;

public class CreateSimpleClass {
    public static void create(String textWithoutKeyWord) {
        String stringWithoutLastSymbol = textWithoutKeyWord.substring(0, textWithoutKeyWord.length() - 1);
        CreateJavaFile.create(stringWithoutLastSymbol);
        GenerateSimpleTextInFile.generate(stringWithoutLastSymbol);
        System.out.println("create table: " + stringWithoutLastSymbol);
    }
}
