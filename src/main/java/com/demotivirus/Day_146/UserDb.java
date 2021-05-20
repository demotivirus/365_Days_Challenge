package com.demotivirus.Day_146;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class UserDb {
    private List<User> users = new ArrayList<>();

    {
        for (int i = 0; i < 10; i++) {
            User user = new User(i, "012345");
            users.add(user);
        }
        log.info("Init {} users", 10);
    }

    public User get(int id) {
        log.info("Get user {}", users.get(id));
        return users.get(id);
    }

    public void update(User user) {
        User oldUser = users.get(user.getId());
        User newUser = oldUser;
        newUser.setCellPhone(user.getCellPhone());
        log.info("Update user {} New user is {}", oldUser, newUser);
    }

    public void save(User newUser) {
        if (!users.get(newUser.getId()).equals(newUser))
            users.add(newUser);
        log.info("Save user {}", newUser);
    }

    public void delete(int id) {
        if (users.get(id) != null)
            users.remove(id);
        log.warn("Delete user {}", users.get(id));
    }
}
