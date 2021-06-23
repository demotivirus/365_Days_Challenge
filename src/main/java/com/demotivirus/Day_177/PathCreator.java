package com.demotivirus.Day_177;

import lombok.Getter;

public class PathCreator {
    @Getter
    private static String defaultPath = "src/main/java/com/demotivirus/";

    public static void setNewPath(String newPath) {
        String str = newPath.replace("-P", "").replace("--path", "").replace(" ", "");
        defaultPath = str;
    }
}
