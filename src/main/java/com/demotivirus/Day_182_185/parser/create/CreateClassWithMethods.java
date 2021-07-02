package com.demotivirus.Day_182_185.parser.create;

import com.demotivirus.Day_182_185.creator.CreateJavaFile;
import com.demotivirus.Day_182_185.text.GenerateTextInFile;

import java.util.Map;

public class CreateClassWithMethods {
    public static void create(String tableName, Map<String, String> fieldAndType) {
        CreateJavaFile.create(tableName);
        GenerateTextInFile.generate(tableName, fieldAndType);
        System.out.println(fieldAndType);
    }
}
