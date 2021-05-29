package com.demotivirus.Day_154_S2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //READ FROM XML
        //ApplicationContext context = new ClassPathXmlApplicationContext("/app-context.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();
    }
}
