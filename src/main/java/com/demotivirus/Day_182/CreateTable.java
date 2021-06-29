package com.demotivirus.Day_182;

import java.util.HashMap;
import java.util.Map;

public class CreateTable {
    public void create(String query) {
        SimpleClassCreator simpleClassCreator = new SimpleClassCreator();
        TextCodeGenerator textCodeGenerator = new TextCodeGenerator();
        String keyString = "CREATE TABLE ";

        int startIndex = keyString.length();
        if (query.toUpperCase().startsWith(keyString)) {
            String substring = query.substring(startIndex);

//            String[] split = substring.split(" ");
//            for (int i = 0; i < split.length; i++) {
//                if (split.length == 1) {
//                    String stringWithoutLastSymbol = substring.substring(0, substring.length() - 1);
//                    simpleClassCreator.create(stringWithoutLastSymbol);
//                    textCodeGenerator.generate(stringWithoutLastSymbol);
//                }
//            }
            if (!substring.contains("(") || !substring.contains(")")) {
                String stringWithoutLastSymbol = substring.substring(0, substring.length() - 1);
                simpleClassCreator.create(stringWithoutLastSymbol);
                textCodeGenerator.generate(stringWithoutLastSymbol);
            } else {
                String[] splitForSpace = substring.split(" ");
                String tableName = splitForSpace[0];

                int indexForRemoveTableNameWord = tableName.length();

                String substring2 = substring.substring(indexForRemoveTableNameWord)
                        .replaceFirst("[(]", "")
                        //.replace(")", "")
                        .replace(";", "")
                        .trim();
                        //.split(",");
                String[] keyValue = substring2.substring(0, substring2.length() - 1).split(",");

                Map<String, String> fieldAndType = new HashMap<>();
                for (String s : keyValue) {
                    String[] split = s.trim().split(" ");
                    String type = split[1];
                    if (type.equalsIgnoreCase("varchar")
                            || type.equalsIgnoreCase("char")
                            || type.equalsIgnoreCase("varchar)")
                            || type.equalsIgnoreCase("char)")
                    )
                        split[1] = "String";
                    if (type.equalsIgnoreCase("int") || type.equalsIgnoreCase("int)"))
                        split[1] = "int";

                    if (type.equalsIgnoreCase("void") || type.equalsIgnoreCase("void)"))
                        split[1] = "void";
                    if (s.contains("references") || s.contains("REFERENCES")) {
                        fieldAndType.putIfAbsent(split[0], split[3]); //demo Demo
                    } else {
                        String fieldName = split[0];
                        String fieldTypeWithoutLastBracket = split[1].substring(0, split[1].length());
                        fieldAndType.putIfAbsent(fieldName, fieldTypeWithoutLastBracket); //firstName String
                    }
                }
                simpleClassCreator.create(tableName);
                textCodeGenerator.generate(tableName, fieldAndType);
                System.out.println(fieldAndType);
            }
        }
    }
}
