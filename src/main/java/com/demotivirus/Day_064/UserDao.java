package com.demotivirus.Day_064;

import java.util.List;

public interface UserDao {
    User getUserByUsername(String username) throws NullPointerException;
    List<User> findAllUsers();
}
