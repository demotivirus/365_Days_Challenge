package com.demotivirus.Day_056.service;

import com.demotivirus.Day_056.model.Role;
import com.demotivirus.Day_056.model.User;

public interface UserService {
    void updateUserRole(Long userId, Role role);
    User getOneById(Long id);
}
