package com.demotivirus.Day_182_187.text;

import java.util.Map;

public class GenerateTextForFields {
    public static String getText(String className, Map<String, String> fieldType) { //todo 04.07 - clean this class
       // PathCreator pathCreator = new PathCreator();
        //String extension = className + ".java";
        //File file = new File(pathCreator.getPath() + extension);
//        String packageName = file.getPath().replace("\\".concat(extension), "")
//                .replace("\\", ".")
//                .replace("src.main.java.", "");

        StringBuilder fieldsText = new StringBuilder();
        fieldType.forEach((k, v) -> {
            fieldsText.append("\tprivate ").append(v).append(" ").append(k).append(";\n");
        });

        return fieldsText.toString();
    }
}
