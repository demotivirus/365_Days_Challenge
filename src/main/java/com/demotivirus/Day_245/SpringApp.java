package com.demotivirus.Day_245;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SpringApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class);
    }
}
