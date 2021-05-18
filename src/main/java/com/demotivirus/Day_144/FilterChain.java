package com.demotivirus.Day_144;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    @Setter
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters)
            filter.execute(request);

        target.execute(request);
    }
}
