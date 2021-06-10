package com.demotivirus.Day_164;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostgreSQL implements DataBase {
    private CommandDispatcher commandDispatcher;
    private Map<String, Integer> data;

    public PostgreSQL() {
        commandDispatcher = new CommandDispatcher();
        data = new HashMap<>();

        data.put("Tom", 250000);
        data.put("Klara", 32000);
        data.put("Markus", 84000);
        data.put("Sem", 291000);
        data.put("Frodo", 2000);
    }

    public void execute(Command command) {
        commandDispatcher.execute(command, data);
    }
}
