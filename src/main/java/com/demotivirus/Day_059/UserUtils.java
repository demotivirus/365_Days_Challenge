package com.demotivirus.Day_059;

public class UserUtils {
    public static UserPermissions getUserPermissionsFromXT(UserPermissionsXT userPermissionsXT, Long objectId) {
        //some checks for sag=fe programming
        UserPermissions userPermissions = new UserPermissions();
        userPermissions.setDateTimeCreate("12.01.1991");
        userPermissions.setRole(userPermissionsXT.getRole());

        return userPermissions;
    }
}
