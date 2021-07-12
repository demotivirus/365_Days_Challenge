package com.demotivirus.Day_195.converter;

import org.springframework.stereotype.Component;

@Component
public class StringFormatConverter implements FormatConverter{
    @Override
    public Class<?> getOutputFormat() {
        return String.class;
    }

    @Override
    public Object convert(String value) {
        return value;
    }
}
