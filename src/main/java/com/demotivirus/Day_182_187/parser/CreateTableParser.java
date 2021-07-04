package com.demotivirus.Day_182_187.parser;

import com.demotivirus.Day_182_187.parser.create.CreateSimpleClass;
import com.demotivirus.Day_182_187.text.GenerateFullTextAndCreateClass;
import com.demotivirus.Day_182_187.text.GenerateTextForFields;
import com.demotivirus.Day_182_187.text.GenerateTextForMethods;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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

                String fields = parseQueryWithoutMethods(tableName, textWithoutFirstBrace);
                String methods = parseQueryWithMethodsKeyWord(tableName, textWithoutFirstBrace);

                GenerateFullTextAndCreateClass.generate(tableName, fields, methods);
                

//                if (textWithoutFirstBrace.toLowerCase().contains("methods ("))
//                    parseQueryWithMethodsKeyWord(tableName, textWithoutFirstBrace);
//                else parseQueryWithoutMethods(tableName, textWithoutFirstBrace);
            }
        }
    }

    private String parseQueryWithoutMethods(String tableName, String query) {
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
        return GenerateTextForFields.getText(tableName, fieldAndType);
        //return CreateClassWithMethods.create(tableName, fieldAndType);
    }

    private String parseQueryWithMethodsKeyWord(String tableName, String query) {
        String keyWord = "methods (";
        int index = query.indexOf(keyWord);
        String queryWithoutMethodKeyWord = query.substring(index + keyWord.length(), query.length() - 2);

        String[] keyValue = queryWithoutMethodKeyWord.split(";");

        List<String> methods = new ArrayList<>();
        for (String s : keyValue) {
            methods.add(s.trim());
        }
        return GenerateTextForMethods.getText(tableName, methods);
        // CreateClassWithMethods.create(tableName, methods);
    }
}
