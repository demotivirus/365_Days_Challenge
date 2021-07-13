package com.demotivirus.Day_196;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloRepository helloRepository;

    @Override
    public String get() {
        return helloRepository.get();
    }
}
