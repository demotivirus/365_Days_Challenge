package com.demotivirus.Day_064;

import lombok.Data;

@Data
public class User {
    private long id;
    private String username;
    private String role;

    public User(String username) {
        this.username = username;
    }

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }
}
