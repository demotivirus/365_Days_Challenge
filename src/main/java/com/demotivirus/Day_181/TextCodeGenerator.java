package com.demotivirus.Day_181;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

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
            AtomicInteger size = new AtomicInteger();
            fieldType.forEach((k, v) -> {
                size.getAndIncrement();
                sb.append("\t").append("private ").append(v).append(" ").append(k).append(";");
                if (!(size.get() == fieldType.size()))
                    sb.append("\n");

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
