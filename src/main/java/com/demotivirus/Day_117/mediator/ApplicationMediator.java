package com.demotivirus.Day_117.mediator;

import com.demotivirus.Day_117.colleague.Colleague;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMediator implements Mediator {
    private List<Colleague> colleagueList = new ArrayList<>();

    public void addColleague(Colleague colleague){
        colleagueList.add(colleague);
    }

    @Override
    public void send(String message, Colleague colleague) {
        for (Colleague c : colleagueList){
            if (c != colleague)
                c.receive(message);
        }
    }
}
