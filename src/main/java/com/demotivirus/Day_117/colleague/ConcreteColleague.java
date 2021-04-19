package com.demotivirus.Day_117.colleague;

import com.demotivirus.Day_117.mediator.Mediator;

public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague received: " + message);
    }
}
