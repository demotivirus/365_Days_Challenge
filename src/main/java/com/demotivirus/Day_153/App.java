package com.demotivirus.Day_153;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.demotivirus.Day_153"})
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext((App.class));

        HelloImpl hello = (HelloImpl) applicationContext.getBean("helloImpl");
        hello.sayHello();

        NotImplBean notImplBean = applicationContext.getBean("notImplBean", NotImplBean.class);
        notImplBean.sayHello();
    }
}
