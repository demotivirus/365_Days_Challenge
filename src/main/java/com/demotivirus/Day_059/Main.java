package com.demotivirus.Day_059;

public class Main {
    public static void main(String[] args) {
        UpdateUserRoleRequestType request = new UpdateUserRoleRequestType(
                11111l,
                22222l,
                2545232566L,
                "AGENT_RECRUITT");

        UpdateUserRoles updateUserRoles = new UpdateUserRoles();
        UpdateUserRoleResponseType updateUserRoleResponseType = updateUserRoles.update(request);
        System.out.println(updateUserRoleResponseType);
    }
}
