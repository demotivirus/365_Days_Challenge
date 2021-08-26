package com.demotivirus.Day_238;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Slf4j @ToString
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class LombokLoggerAndFinal {
    @NonNull String email;

    public static void main(String[] args) {
        LombokLoggerAndFinal lombok = new LombokLoggerAndFinal("null");
        log.info(lombok.toString());
    }
}
