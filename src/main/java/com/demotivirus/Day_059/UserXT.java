package com.demotivirus.Day_059;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserXT {
    @NonNull
    private Long userId;

    @NonNull
    private String email;

    private List<UserPermissionsXT> roles;

    public List<UserPermissionsXT> getRoles() {
        if(roles == null)
            roles = new ArrayList<>();
        return roles;
    }
}
