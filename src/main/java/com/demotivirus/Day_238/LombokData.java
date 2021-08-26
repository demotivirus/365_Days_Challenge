package com.demotivirus.Day_238;

import lombok.Data;
import lombok.NonNull;

@Data
public class LombokData {
    @NonNull
    private String email;

    public static void main(String[] args) {
        LombokData data = new LombokData("sdfsdf");
    }
}
