package com.demotivirus.Day_064;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserService {
    @NonNull
    private UserDao userDao;

    public boolean checkUserIsPresent(User user){
        User findingUser = userDao.getUserByUsername(user.getUsername());
        return findingUser != null;
    }
}
