package com.demotivirus.Day_064;

import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private List<User> users;

    public UserDaoImpl() {
        this.users = Arrays.asList(
                new User("olesya@gmail.com", "GUEST"),
                new User("kirill@gmail.com", "USER"),
                new User("remy@gmail.com", "ADMIN")
        );
    }

    @Override
    public User getUserByUsername(String username) {
        return users.stream().filter(u -> u.getUsername().equals(username))
                .findAny().orElse(null);
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
