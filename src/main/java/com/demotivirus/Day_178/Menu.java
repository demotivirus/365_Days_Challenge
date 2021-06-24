package com.demotivirus.Day_178;

import java.util.Scanner;

import static com.demotivirus.Day_178.constants.Commands.HELP;
import static com.demotivirus.Day_178.constants.Commands.P;
import static com.demotivirus.Day_178.constants.Commands.PACKAGE;
import static com.demotivirus.Day_178.constants.Commands.PATH;

public class Menu {
    public void readMenu(Scanner scn) {
        CreateTable table = new CreateTable();
        PathCreator pathCreator = new PathCreator();
        String command = "";

        if (scn.hasNextLine()) {
            command = scn.nextLine();
            if (command != null) {
                if (command.equalsIgnoreCase(HELP.getCommand()))
                    HelpCommands.print();
                if (command.startsWith(P.getCommand()) || command.startsWith(PATH.getCommand()))
                    pathCreator.setNewPath(command);
                if (command.startsWith(PACKAGE.getCommand()))
                    PackageCreator.setNewPackage(command);
                if (command.toUpperCase().startsWith("CREATE TABLE ")) {
                    table.create(command);

                    System.out.println("Continue? [Y]/[N]");
                    if (scn.nextLine().equalsIgnoreCase("Y")) {
                        for (int i = 0; i < 1; i++) {
                            readMenu(scn);
                        }
                    } else {
                        System.out.println("GENERATE SUCCESS");
                        return;
                    }
                } else {
                    System.out.println("It's not a command. See --help");
                }
            }
        }
    }
}
