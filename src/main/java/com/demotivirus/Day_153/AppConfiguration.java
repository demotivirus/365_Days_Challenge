package com.demotivirus.Day_153;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan("com.demotivirus.Day_153")
public class AppConfiguration {

    @Bean(name ="hello")
    public Hello getHello() {

        return new HelloImpl();
    }

}
