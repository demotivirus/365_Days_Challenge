package com.demotivirus.Day_111;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DatabaseService {
    private Command insert;
    private Command update;
    private Command read;
    private Command delete;

    public void insert(){
        insert.execute();
    }

    public void update(){
        update.execute();
    }

    public void read(){
        read.execute();
    }

    public void delete(){
        delete.execute();
    }

    public void getAllCommands(){
        insert.execute();
        update.execute();
        read.execute();
        delete.execute();
    }
}
