package com.demotivirus.Day_228.Tip_16;

public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Octal string: " + Integer.toOctalString(subject.getState()));
    }
}
