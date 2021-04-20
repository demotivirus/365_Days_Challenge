package com.demotivirus.Day_118.mediator;

import com.demotivirus.Day_118.user.User;
import com.demotivirus.Day_118.user.UserImpl;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
