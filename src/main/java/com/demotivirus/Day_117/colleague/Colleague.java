package com.demotivirus.Day_117.colleague;

import com.demotivirus.Day_117.mediator.Mediator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Colleague {
    private Mediator mediator;

    public void send(String message){
        mediator.send(message, this);
    }

    public abstract void receive(String message);
}
