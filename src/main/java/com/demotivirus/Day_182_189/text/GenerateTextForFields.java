package com.demotivirus.Day_182_189.text;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class GenerateTextForFields {
    public static String getText(String className, Map<String, String> fieldType) {
        StringBuilder fieldsText = new StringBuilder();
        AtomicInteger size = new AtomicInteger();
        fieldType.forEach((k, v) -> {
            size.getAndIncrement();
            fieldsText.append("\tprivate ").append(v).append(" ").append(v).append(";");
            if (size.get() != fieldType.size())
                fieldsText.append("\n");
        });
        return fieldsText.toString();
    }
}
