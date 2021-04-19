package com.demotivirus.Day_117.colleague;

import com.demotivirus.Day_117.mediator.Mediator;

public class MobileColleague extends Colleague {
    public MobileColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Mobile received: " + message);
    }
}
