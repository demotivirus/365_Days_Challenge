package com.demotivirus.Day_085_;

import lombok.Data;
import lombok.NonNull;

@Data
public abstract class AbstractEmployee implements Employee {
    @NonNull
    protected long id;

    @NonNull
    protected String name;

    @NonNull
    protected String position;
}
