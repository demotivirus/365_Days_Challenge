package com.demotivirus.Day_059;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class UpdateUserRoleResponseType {
    private RoleXT roleXT;
    private UserPermissions userPermissions;
}
