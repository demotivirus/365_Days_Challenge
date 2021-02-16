package com.demotivirus.Day_057;

import lombok.Data;

import java.util.Random;

@Data
public class Tree {
    private String UUID;

    public Tree(){
        Random r = new Random();
        int serialNumbers = r.nextInt(20);
        if (serialNumbers == 0) serialNumbers++;
        UUID = CharGenerator.generate(serialNumbers);
    }
}
