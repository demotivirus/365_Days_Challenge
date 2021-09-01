package com.demotivirus.Day_238;

public class LombokSneaky {
    //@SneakyThrows
    public void sneaky() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
