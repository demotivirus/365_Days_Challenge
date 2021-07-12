package com.demotivirus.Day_195.converter;

public interface FormatConverter {
    Class<?> getOutputFormat();
    Object convert(String value);
}
