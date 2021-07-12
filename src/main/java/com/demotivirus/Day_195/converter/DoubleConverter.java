package com.demotivirus.Day_195.converter;

import org.springframework.stereotype.Component;

@Component
public class DoubleConverter implements FormatConverter {
    @Override
    public Class<?> getOutputFormat() {
        return Double.class;
    }

    @Override
    public Object convert(String value) {
//        if (value != null && value.length() != 0)
//            return Double.valueOf(value);
        return value;
    }
}
