package com.demotivirus.Day_058_S2;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class UserPermissions {
//    private Long userId;
//    private Long roleId;
    //private Map<Long, Long> userPermissions;
    private Map<User, Role> userPermissions;

//    public void updateUserRole(long userId, long roleId) {
//        if (userPermissions == null)
//            userPermissions = new HashMap<>();
//        userPermissions.put(userId, roleId);
//    }

    public void updateUserRole(User user, Role role) {
        if (userPermissions == null)
            userPermissions = new HashMap<>();
        userPermissions.put(user, role);
        user.addRole(role);
    }
}
