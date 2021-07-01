package com.demotivirus.Day_182_184.path.settings;

import lombok.Getter;

import static com.demotivirus.Day_182_184.constants.Commands.P;
import static com.demotivirus.Day_182_184.constants.Commands.PATH;

public class PathCreator {
    @Getter
    private String path = "src/main/java/com/demotivirus/";

    public void setNewPath(String newPath) {
        path = newPath.replace(P.getCommand(), "")
                .replace(PATH.getCommand(), "")
                .replace(" ", "");
    }
}
