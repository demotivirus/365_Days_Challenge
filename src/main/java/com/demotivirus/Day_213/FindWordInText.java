package com.demotivirus.Day_213;

public class FindWordInText {
    public String find(String[] words, String word) {
        StringBuilder sb = new StringBuilder();
        for (String line : words) {
            if (line.toLowerCase().contains(word.toLowerCase()))
                sb.append(line.trim()).append("\n\n");
        }
        return sb.toString();
    }
}
