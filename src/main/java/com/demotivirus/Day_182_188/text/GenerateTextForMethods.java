package com.demotivirus.Day_182_188.text;

import java.util.List;

public class GenerateTextForMethods {
    public static String getText(String className, List<String> methods) {
        StringBuilder methodsText = new StringBuilder();
        for (String m : methods) {
            if (methods.size() != 1)
                methodsText.append("\n");
            if (m.contains("void"))
                methodsText.append("\tprivate ").append(m).append("{\n\t\t\n\t}");
            else methodsText.append("\tprivate ").append(m).append("{\n\t\t\n\t\treturn null;\n\t}");
            if (methods.indexOf(m) != methods.size() - 1)
                methodsText.append("\n");
        }
        return methodsText.toString();
    }
}
