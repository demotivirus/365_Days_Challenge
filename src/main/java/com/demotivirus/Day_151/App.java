package com.demotivirus.Day_151;

import com.demotivirus.Day_151.lazy.Lazy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class);
        Lazy lazy = (Lazy) context.getBean("lazy");
    }
}
