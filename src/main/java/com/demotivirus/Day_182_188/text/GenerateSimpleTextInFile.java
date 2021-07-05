package com.demotivirus.Day_182_188.text;

import com.demotivirus.Day_182_188.path.settings.PathCreator;
import com.demotivirus.Day_182_188.text.writer.WriteTextInFile;

import java.io.File;

public class GenerateSimpleTextInFile {
    public static void generate(String className) {
        String extension = className + ".java";
        File file = new File(PathCreator.getPath() + extension);
        String packageName = file.getPath().replace("\\".concat(extension), "")
                .replace("\\", ".")
                .replace("src.main.java.", "");

        String generatingText = """
                package %s;

                public class %s {
                \t
                }"""
                .formatted(packageName, className);

        WriteTextInFile.write(file, generatingText);
    }
}
