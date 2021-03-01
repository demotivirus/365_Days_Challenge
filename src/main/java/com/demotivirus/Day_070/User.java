package com.demotivirus.Day_070;

import lombok.Data;

@Data
public class User {
    private UserName userName;
    private UserAuthorization userAuthorization;
    private String country;

    public User(){
        this.userName = new UserName();
        this.userAuthorization = new UserAuthorization();
    }
}
