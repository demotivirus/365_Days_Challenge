package com.demotivirus.Day_115;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
public class From implements Expression {
    @NonNull
    private String table;
    private Where where;

    @Override
    public List<String> interpret(Context context) {
        context.setTable(table);
        return where == null ? context.search() : where.interpret(context);
    }
}
