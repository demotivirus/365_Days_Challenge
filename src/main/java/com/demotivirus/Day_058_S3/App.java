package com.demotivirus.Day_058_S3;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                out.println("\n\n" +
                        "█▀▄ █▀▀ █▄░▄█ ▄▀▄ ▀█▀ ▀ ▐▌░▐▌ ▀ █▀▀▄ █░█ ▄▀▀ \n" +
                        "█░█ █▀▀ █░█░█ █░█ ░█░ █ ░▀▄▀░ █ █▐█▀ █░█ ░▀▄ \n" +
                        "▀▀░ ▀▀▀ ▀░░░▀ ░▀░ ░▀░ ▀ ░░▀░░ ▀ ▀░▀▀ ░▀░ ▀▀░ " +
                        "\n\n");
            }
        });

        app.run(args);
    }
}
