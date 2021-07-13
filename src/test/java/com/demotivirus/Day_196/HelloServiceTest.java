package com.demotivirus.Day_196;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@ComponentScan("com.demotivirus.Day_196")
//@RunWith(SpringRunner.class)
public class HelloServiceTest {
    private HelloService helloService;

    @Autowired
    public HelloServiceTest(HelloService helloService) {
        this.helloService = helloService;
    }

    @Test
    @DisplayName("Now, test is working :)")
    void testGetMethod() {
        Assertions.assertEquals("Hello from Junit 5", helloService.get());
    }
}
