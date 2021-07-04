package com.demotivirus.Day_182_187.text;

import java.util.List;

public class GenerateTextForMethods {
    public static String getText(String className, List<String> methods) { //todo 04.07 - clean this class
//        PathCreator pathCreator = new PathCreator();
//        String extension = className + ".java";
//        File file = new File(pathCreator.getPath() + extension);
//        String packageName = file.getPath().replace("\\".concat(extension), "")
//                .replace("\\", ".")
//                .replace("src.main.java.", "");

        StringBuilder methodsText = new StringBuilder();
        for (String m : methods) {
            if (m.contains("void"))
                methodsText.append("\tprivate ").append(m).append("{\n\t\t\n\t}\n\n");
            else methodsText.append("\tprivate ").append(m).append("{\n\t\t\n\t\treturn null;\n\t}\n\n");
        }

//        String createTextForMethods = """
//                %s""".formatted(methodsText.toString());

        return methodsText.toString();
    }
}
