package com.demotivirus.Day_153_S2.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(name = "myProperties", value = "values.properties")
public class MyApp {
    public static void main(String[] args) {
        System.setProperty("systemValue", "Some system parameter value");
        System.setProperty("priority", "System property");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ValuesApp.class);
    }
}
