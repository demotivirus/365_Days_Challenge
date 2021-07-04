package com.demotivirus.Day_182_187.parser.create;

import com.demotivirus.Day_182_187.creator.CreateJavaFile;

import java.util.List;
import java.util.Map;

public class CreateClassWithMethods {
    public static void create(String tableName, Map<String, String> fieldAndType) {
        CreateJavaFile.create(tableName);
       // GenerateTextInFile.generate(tableName, fieldAndType);
        System.out.println(fieldAndType);
    }

    public static void create(String tableName, List<String> methods) {
        CreateJavaFile.create(tableName);
        //GenerateTextInFile.generate(tableName, methods);
        System.out.println(methods);
    }
}
