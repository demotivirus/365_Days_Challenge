package com.demotivirus.Day_061_062;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class Dictionary {
    public static void main(String[] args) {
        SpringApplication.run(Dictionary.class);
    }
}
