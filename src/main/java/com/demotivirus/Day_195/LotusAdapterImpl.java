package com.demotivirus.Day_195;

import com.demotivirus.Day_195.converter.FormatConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class LotusAdapterImpl implements LotusAdapter {
    private final Map<Class<?>, FormatConverter> converters;

    @Autowired
    public LotusAdapterImpl(List<FormatConverter> formatConverters) {
        this.converters = formatConverters.stream().collect(Collectors.toMap(FormatConverter::getOutputFormat, mapper -> mapper));
    }


    @Override
    public String convert(Map<String, String> data) {
        ClassForMapping classForMapping = new ClassForMapping("Text here", "100.0");

        Field[] fields = classForMapping.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);

            //some logic here

            try {
                field.set(classForMapping, converters.get(field.getType()).convert(field.getName()));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.err.println(classForMapping);
        return classForMapping.toString();
    }
}
