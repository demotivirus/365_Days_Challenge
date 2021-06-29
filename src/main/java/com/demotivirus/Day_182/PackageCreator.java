package com.demotivirus.Day_182;

import lombok.Getter;

import static com.demotivirus.Day_178.constants.Commands.PACKAGE;

public class PackageCreator {
    @Getter
    private static String packageName = "com.demotivirus";

    public static void setNewPackage(String newPackage) {
        packageName = newPackage.replace(PACKAGE.getCommand(), "")
                .replace(" ", "");
    }
}
