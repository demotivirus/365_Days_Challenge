package com.demotivirus.Day_182_185.parser;

import com.demotivirus.Day_182_185.parser.create.CreateClassWithMethods;
import com.demotivirus.Day_182_185.parser.create.CreateSimpleClass;

import java.util.LinkedHashMap;
import java.util.Map;

public class CreateTableParser {
    public void parseQuery(String query) {
        String keyString = "CREATE TABLE ";
        int startIndex = keyString.length();
        if (query.toUpperCase().startsWith(keyString)) {
            String textWithoutKeyWord = query.substring(startIndex);
            if (!textWithoutKeyWord.contains("(") || !textWithoutKeyWord.contains(")"))
                CreateSimpleClass.create(textWithoutKeyWord);
            else {
                String[] splitForSpace = textWithoutKeyWord.split(" ");
                String tableName = splitForSpace[0];

                int indexForRemoveTableNameWord = tableName.length();

                String textWithoutFirstBrace = textWithoutKeyWord.substring(indexForRemoveTableNameWord)
                        .replaceFirst("[(]", "")
                        //.replace(";", "")
                        .trim();

                if (textWithoutFirstBrace.toLowerCase().contains("methods"))
                    parseQueryWithMethodsKeyWord(tableName, textWithoutFirstBrace);
                else parseQueryWithoutMethods(tableName, textWithoutFirstBrace);
            }
        }
    }

    private void parseQueryWithoutMethods(String tableName, String query) {
        String[] keyValue = query.substring(0, query.length() - 1)
                .split(","); //todo 30.06 - not split correctly

        //todo 30.06 - add constructor
        Map<String, String> fieldAndType = new LinkedHashMap<>();
        for (String s : keyValue) {
            String[] split = s.trim().split(" ");

            String oldType = split[1].replace(")", "");
            split[1] = ParseOldTypeFieldInNewType.parse(oldType);

            if (s.contains("references") || s.contains("REFERENCES")) {
                fieldAndType.putIfAbsent(split[0], split[3]); //demo Demo
            } else {
                String fieldName = split[0];
                String fieldTypeWithoutLastBracket = split[1].substring(0, split[1].length());
                fieldAndType.putIfAbsent(fieldName, fieldTypeWithoutLastBracket); //firstName String
            }
        }
        CreateClassWithMethods.create(tableName, fieldAndType);
    }

    private void parseQueryWithMethodsKeyWord(String tableName, String query) {
        int index = query.indexOf("method");
        String queryWithoutMethodKeyWord = query.substring(index, query.length() - 1);
        //todo 03.07 - add logic for "method" key word

//        String[] keyValue = query.substring(0, query.length() - 1)
//                .split(","); //todo 30.06 - not split correctly
//
//        //todo 30.06 - add constructor
//        Map<String, String> fieldAndType = new LinkedHashMap<>();
//        for (String s : keyValue) {
//            String[] split = s.trim().split(" ");
//
//            String oldType = split[1].replace(")", "");
//            split[1] = ParseOldTypeFieldInNewType.parse(oldType);
//
//            if (s.contains("references") || s.contains("REFERENCES")) {
//                fieldAndType.putIfAbsent(split[0], split[3]); //demo Demo
//            } else {
//                String fieldName = split[0];
//                String fieldTypeWithoutLastBracket = split[1].substring(0, split[1].length());
//                fieldAndType.putIfAbsent(fieldName, fieldTypeWithoutLastBracket); //firstName String
//            }
//        }
//        CreateClassWithMethods.create(tableName, fieldAndType);
    }
}
