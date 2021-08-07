package com.demotivirus.Day_220;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
@AllArgsConstructor
public class Computer {
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor monitor;

    public void writeText(String text) {
        keyboard.writeText(text);
    }

    public void show(String text) {
        monitor.show(text);
    }

    public void scroll() {
        mouse.scroll();
    }

    public void updateMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void updateMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void updateKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
