package com.demotivirus.Day_182_189.path.settings;

import lombok.Getter;

import static com.demotivirus.Day_182_189.constants.Command.P;
import static com.demotivirus.Day_182_189.constants.Command.PATH;

public class PathCreator {
    @Getter
    private static String path = "src/main/java/com/demotivirus/";

    public static void setNewPath(String newPath) {
        path = newPath.replace(P.getCommand(), "")
                .replace(PATH.getCommand(), "")
                .replace(" ", "");
    }
}
