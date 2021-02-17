package com.demotivirus.Day_058_S2;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {
    @NonNull
    private long id;
    private String name;
    private List<Role> roles = new ArrayList<>();
    //private UserPermissions permissions;

    public void updateRole(Role role) {
        if (roles.isEmpty()){
            roles.add(role);
            //addUserPermissions(role);
        }
        else {
            if (roles.contains(role))
                return;
            roles.add(role);
            //addUserPermissions(role);
        }
    }

    public void addRole(Role role){
        roles.add(role);
    }

//    private void addUserPermissions(Role role){
//        if (permissions == null)
//            permissions = new UserPermissions();
//        permissions.setUserId(this.id);
//        permissions.setRoleId(role.getId());
//    }
}
