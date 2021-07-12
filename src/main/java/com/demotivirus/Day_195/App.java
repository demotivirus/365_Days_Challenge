package com.demotivirus.Day_195;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.Map;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class App {
    @Autowired
    private LotusAdapter lotusAdapter;

    @Autowired
    private ApplicationContext appContext;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        //app.run(args); //shou all beans

        ConfigurableApplicationContext run = SpringApplication.run(App.class);
        LotusAdapter lotusAdapter = run.getBean(LotusAdapter.class);
        Map<String, String> data = Map.of("Hello", "From me", "HelloToo", "To you");
        lotusAdapter.convert(data);
    }

    public void run(String... args) throws Exception {
        String[] beans = appContext.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) {
            System.out.println(bean);
        }
    }
}
