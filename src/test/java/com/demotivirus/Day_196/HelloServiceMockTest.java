package com.demotivirus.Day_196;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceMockTest {

    @Mock
    private HelloRepository helloRepository;

    @InjectMocks // auto inject helloRepository
    private HelloService helloService = new HelloServiceImpl();

    @BeforeEach
    void setMockOutput() {
        Mockito.when(helloRepository.get()).thenReturn("Hello Mockito From Repository");
    }

    @Test
    @DisplayName("Test Mock helloService + helloRepository")
    void testGet() {
        Assertions.assertEquals("Hello Mockito From Repository", helloService.get());
    }

}
