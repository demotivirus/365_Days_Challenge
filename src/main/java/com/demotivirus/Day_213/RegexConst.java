package com.demotivirus.Day_213;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RegexConst {
    SYMBOL_EXCLAMATION("(![^‘’])"),
    SYMBOL_DOT("\"\\\\b[.]\"");

    private String regex;
}
