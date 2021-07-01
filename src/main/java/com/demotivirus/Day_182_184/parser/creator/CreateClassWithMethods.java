package com.demotivirus.Day_182_184.parser.creator;

import com.demotivirus.Day_182_184.text.GenerateTextInFile;
import com.demotivirus.Day_182_184.util.CreateJavaFile;

import java.util.Map;

public class CreateClassWithMethods {
    public static void create(String tableName, Map<String, String> fieldAndType) {
        CreateJavaFile.create(tableName);
        GenerateTextInFile.generate(tableName, fieldAndType);
        System.out.println(fieldAndType);
    }
}
