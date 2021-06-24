package com.demotivirus.Day_178;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextCodeGenerator {
    public void generate(String className) {
        PathCreator pathCreator = new PathCreator();
        String extension = className + ".java";
        File file = new File(pathCreator.getPath() + extension);
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            String packageName = file.getPath().replace("\\".concat(extension), "")
                    .replace("\\", ".")
                    .replace("src.main.java.", "");

            String codeGen = """
                package %s;

                public class %s {

                }
                """
                    .formatted(packageName, className);
            out.println(codeGen);
            out.flush();
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
}
