package com.demotivirus.Day_118.user;

import com.demotivirus.Day_118.mediator.ChatMediator;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    public abstract void send(String message);
    public abstract void receive(String message);
}
