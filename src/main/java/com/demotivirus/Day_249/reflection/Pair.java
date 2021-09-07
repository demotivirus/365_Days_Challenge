package com.demotivirus.Day_249.reflection;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public final class Pair<L, R> extends Tuple implements Comparable {
    L l;
    R r;

    public Pair(L l, R r) {
        this.l = l;
        this.r = r;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
