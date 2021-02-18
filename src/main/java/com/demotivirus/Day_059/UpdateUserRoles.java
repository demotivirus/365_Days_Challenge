package com.demotivirus.Day_059;

public class UpdateUserRoles {
    public UpdateUserRoleResponseType update(UpdateUserRoleRequestType request) {
        UserXT userXT = getUserBySessionXT(request); //find user by session id
        String roleCode = request.getRoleCode(); //get roleCode & next search roleCode on user roles

        //in real project this get from dictionaries
        UserPermissionsXT userPermissionsXT = new UserPermissionsXT("13.20.2011", new RoleXT(1l, roleCode));

        UserPermissions userPermissions = UserUtils.getUserPermissionsFromXT(userPermissionsXT, userXT.getUserId());
        return new UpdateUserRoleResponseType(userPermissions.getRole(), userPermissions);
    }

    private UserXT getUserBySessionXT(UpdateUserRoleRequestType request) {
        return new UserXT(request.getSessionId(), "secretemail@gmail.com");
    }
}
