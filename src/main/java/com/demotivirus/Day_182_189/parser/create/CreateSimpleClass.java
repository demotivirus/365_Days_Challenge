package com.demotivirus.Day_182_189.parser.create;

import com.demotivirus.Day_182_189.creator.CreateJavaFile;
import com.demotivirus.Day_182_189.text.GenerateSimpleTextInFile;

public class CreateSimpleClass {
    public static void create(String textWithoutKeyWord) {
        String stringWithoutLastSymbol = textWithoutKeyWord.substring(0, textWithoutKeyWord.length() - 1);
        CreateJavaFile.create(stringWithoutLastSymbol);
        GenerateSimpleTextInFile.generate(stringWithoutLastSymbol);
        System.out.println("create table: " + stringWithoutLastSymbol);
    }
}