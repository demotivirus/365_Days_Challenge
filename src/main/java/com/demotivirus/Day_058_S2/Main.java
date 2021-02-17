package com.demotivirus.Day_058_S2;

public class Main {
    public static void main(String[] args) {
        User anyUser = new User(15L);
        UserPermissions permissions = new UserPermissions();
        Role role = new Role(1L, "ADMIN");
        permissions.updateUserRole(anyUser, role);
        System.out.println(anyUser);
        System.out.println(permissions);

    }
}
