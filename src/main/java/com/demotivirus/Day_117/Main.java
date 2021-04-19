package com.demotivirus.Day_117;

import com.demotivirus.Day_117.colleague.Colleague;
import com.demotivirus.Day_117.colleague.ConcreteColleague;
import com.demotivirus.Day_117.colleague.MobileColleague;
import com.demotivirus.Day_117.mediator.ApplicationMediator;

public class Main {
    public static void main(String[] args) {
        ApplicationMediator applicationMediator = new ApplicationMediator();
        Colleague mobile = new MobileColleague(applicationMediator);
        Colleague desktop = new ConcreteColleague(applicationMediator);

        applicationMediator.addColleague(mobile);
        applicationMediator.addColleague(desktop);

        mobile.send("Hello world");
        desktop.send("Hello world!!!");
    }
}
