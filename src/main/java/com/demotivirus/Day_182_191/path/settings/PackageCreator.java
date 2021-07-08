package com.demotivirus.Day_182_191.path.settings;

import lombok.Getter;

import static com.demotivirus.Day_182_191.constants.Command.PACKAGE;

public class PackageCreator {
    @Getter
    private static String packageName = "com.demotivirus";

    public static void setNewPackage(String newPackage) {
        packageName = newPackage.replace(PACKAGE.getCommand(), "")
                .replace(" ", "");
    }
}
