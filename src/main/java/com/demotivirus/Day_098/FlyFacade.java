package com.demotivirus.Day_098;

public class FlyFacade {
    private Flyable bird;
    private Flyable bubble;
    private Flyable NLO;

    public FlyFacade() {
        this.bird = new Bird();
        this.bubble = new Bubble();
        this.NLO = new NLO();
    }

    public void flyAll(){
        bird.fly();
        NLO.fly();
        bubble.fly();
    }
}
