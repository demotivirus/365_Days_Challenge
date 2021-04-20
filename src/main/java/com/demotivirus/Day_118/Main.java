package com.demotivirus.Day_118;

import com.demotivirus.Day_118.mediator.ChatMediator;
import com.demotivirus.Day_118.mediator.ChatMediatorImpl;
import com.demotivirus.Day_118.user.User;
import com.demotivirus.Day_118.user.UserImpl;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User user1 = new UserImpl(chatMediator, "Pikachu");
        User user2 = new UserImpl(chatMediator, "Thor");
        User user3 = new UserImpl(chatMediator, "Homo Sapiens");
        User user4 = new UserImpl(chatMediator, "Graf1167");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.send("Hello all who in there");
    }
}
