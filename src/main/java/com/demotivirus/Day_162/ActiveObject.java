package com.demotivirus.Day_162;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Slf4j
public abstract class ActiveObject {
    private BlockingQueue<Runnable> requests;
    @Getter
    private String name;
    private Thread thread;

    public ActiveObject(String name) {
        this.name = name;
        this.requests = new LinkedBlockingQueue<>();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        requests.take().run();
                    } catch (InterruptedException ex) {
                        log.error(ex.getMessage());
                    }
                }
            }
        });

        thread.start();
    }

    public void eat() {
        try {
            requests.put(new Runnable() {
                @Override
                public void run() {
                    log.info("{} is eating", getName());
                    log.info("{} is finished eating", getName());
                }
            });
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }

    public void roam() {
        try {
            requests.put(new Runnable() {
                @Override
                public void run() {
                    log.info("{} has started the roam", getName());
                }
            });
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }
}
