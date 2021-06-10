package com.demotivirus.Day_164;

import java.util.Map;

public class CommandDispatcher {
    public void execute(Command command, Map<String, Integer> data) {
        if (command == Command.SELECT) {
            System.out.println(data.toString());
        }
    }
}
