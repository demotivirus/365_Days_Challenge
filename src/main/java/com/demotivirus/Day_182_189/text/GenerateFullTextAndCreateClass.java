package com.demotivirus.Day_182_189.text;

import com.demotivirus.Day_182_189.path.settings.PathCreator;
import com.demotivirus.Day_182_189.text.writer.WriteTextInFile;

import java.io.File;

public class GenerateFullTextAndCreateClass {
    public static void generate(String className, String fields, String methods) { //todo 05.07 - remove copy past
        PathCreator pathCreator = new PathCreator();
        String extension = className + ".java";
        File file = new File(pathCreator.getPath() + extension);
        String packageName = file.getPath().replace("\\".concat(extension), "")
                .replace("\\", ".")
                .replace("src.main.java.", "");

        String textForClass = """
                package %s;
                
                public class %s {
                %s
                %s
                }""".formatted(packageName, className, fields, methods);
        WriteTextInFile.write(file, textForClass);
    }

    public static void generate(String className, String fields) {
        PathCreator pathCreator = new PathCreator();
        String extension = className + ".java";
        File file = new File(pathCreator.getPath() + extension);
        String packageName = file.getPath().replace("\\".concat(extension), "")
                .replace("\\", ".")
                .replace("src.main.java.", "");

        String textForClass = """
                package %s;
                
                public class %s {
                %s
                }""".formatted(packageName, className, fields);
        WriteTextInFile.write(file, textForClass);
    }

    public static void gen(String className, String methods) {
        PathCreator pathCreator = new PathCreator();
        String extension = className + ".java";
        File file = new File(pathCreator.getPath() + extension);
        String packageName = file.getPath().replace("\\".concat(extension), "")
                .replace("\\", ".")
                .replace("src.main.java.", "");

        String textForClass = """
                package %s;
                
                public class %s {
                %s
                }""".formatted(packageName, className, methods);
        WriteTextInFile.write(file, textForClass);
    }
}
