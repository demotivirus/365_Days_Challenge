package com.demotivirus.Day_117.mediator;

import com.demotivirus.Day_117.colleague.Colleague;

public interface Mediator {
    void send(String message, Colleague colleague);
}
