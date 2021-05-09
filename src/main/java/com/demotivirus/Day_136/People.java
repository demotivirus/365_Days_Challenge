package com.demotivirus.Day_136;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@RequiredArgsConstructor
public class People {
    @NonNull
    private String name;
    @NonNull
    private byte age;

    private Money money;
}
