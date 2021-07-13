package com.demotivirus.Day_196;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {
    @Override
    public String get() {
        return "Hello from Junit 5";
    }
}
