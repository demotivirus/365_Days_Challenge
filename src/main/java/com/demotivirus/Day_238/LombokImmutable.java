package com.demotivirus.Day_238;

import lombok.Value;

@Value
public class LombokImmutable {
    private String email;

    public static void main(String[] args) {
        LombokImmutable immutable = new LombokImmutable("email@gmail.com");
        immutable.getEmail();
        //immutable.set - not setters
    }
}
