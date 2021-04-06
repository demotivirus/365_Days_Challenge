package com.demotivirus.Day_105;

public abstract class AbstractLogger {
    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    abstract protected void write(String message);

    public void log(int level, String message){
        if (this.level <= level)
            write(message);
        if (nextLogger != null)
            nextLogger.log(level, message);
    }
}
