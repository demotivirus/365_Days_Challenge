package com.demotivirus.Day_162;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Main {
    private static final int NUM_CREATURES = 3;

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        List<ActiveObject> objects = new ArrayList<>();
        for (int i = 0; i < NUM_CREATURES; i++) {
            objects.add(new Orc("[" + Orc.class.getSimpleName() + " " + i + "]"));
            objects.add(new Dog("[" +Dog.class.getSimpleName() + " " + i + "]"));

            objects.get(i).eat();
            objects.get(i).roam();
            objects.get(i + 1).eat();
            objects.get(i + 1).roam();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }
}
