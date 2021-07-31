package com.demotivirus.Day_213;

import lombok.Getter;

@Getter
public class SplitTextWithDot {
    private String[] strings;
    public String split(String text) {
        strings = text.split(RegexConst.SYMBOL_DOT.getRegex());
        StringBuilder sb = new StringBuilder();
        for (String s : strings)
            sb.append(s.trim()).append(".").append("\n\n");

        String[] split = sb.toString().split(RegexConst.SYMBOL_EXCLAMATION.getRegex());
        for (String s : split)
            sb.append(s.trim()).append("!").append("\n\n");

        return sb.toString();
    }
}
