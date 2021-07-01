package com.demotivirus.Day_182_184.text;

import com.demotivirus.Day_182_184.path.settings.PathCreator;
import com.demotivirus.Day_182_184.util.WriteTextInFile;

import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class GenerateTextInFile {
    public static void generate(String className, Map<String, String> fieldType) {
        PathCreator pathCreator = new PathCreator();
        String extension = className + ".java";
        File file = new File(pathCreator.getPath() + extension);
        String packageName = file.getPath().replace("\\".concat(extension), "")
                .replace("\\", ".")
                .replace("src.main.java.", "");

        StringBuilder sb = new StringBuilder();
        AtomicInteger size = new AtomicInteger();
        fieldType.forEach((k, v) -> {
            size.getAndIncrement();
            if (!k.contains("(")) {
                sb.append("\t").append("private ").append(v).append(" ").append(k).append(";");
                if (!(size.get() == fieldType.size()))
                    sb.append("\n");
            } else {
                sb.append("\t").append("public ").append(v).append(" ").append(k).append(" {\n");
                if (!v.contains("void")) {
                    if (v.contains("int")) sb.append("\t\treturn 0;\n\t}\n");
                    else sb.append("\t\t\n\t\treturn null;\n\t}\n");
                } else {
                    sb.append("\t\t\n\t}\n");
                }
            }
        });

        String generatingText = """
                package %s;

                public class %s {
                %s
                }"""
                .formatted(packageName, className, sb.toString());

        WriteTextInFile.write(file, generatingText);
    }
}
