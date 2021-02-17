package com.demotivirus.Day_058_S2;

import lombok.Data;
import lombok.NonNull;

@Data
public class Role {
    @NonNull
    private long id;

    @NonNull
    private String roleName;
//    private List<User> users = new ArrayList<>();
}
