package com.demotivirus.Day_179;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class TextCodeGenerator {
    public void generate(String className) {
        PathCreator pathCreator = new PathCreator();
        String extension = className + ".java";
        File file = new File(pathCreator.getPath() + extension);
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
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

    public void generate(String className, Map<String, String> fieldType) {
        PathCreator pathCreator = new PathCreator();
        String extension = className + ".java";
        File file = new File(pathCreator.getPath() + extension);
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            String packageName = file.getPath().replace("\\".concat(extension), "")
                    .replace("\\", ".")
                    .replace("src.main.java.", "");

            StringBuilder sb = new StringBuilder();
            fieldType.forEach((k, v) -> {
                sb.append("\t").append("private ").append(v).append(" ").append(k).append(";").append("\n");
            });

            String codeGen = """
                    package %s;

                    public class %s {
                    %s
                    }
                    """
                    .formatted(packageName, className, sb.toString());
            out.println(codeGen);
            out.flush();
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
}
