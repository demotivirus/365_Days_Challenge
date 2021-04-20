package com.demotivirus.Day_118.mediator;

import com.demotivirus.Day_118.user.User;
import com.demotivirus.Day_118.user.UserImpl;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users){
            if (u != user)
                u.receive(message);
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
