package com.demotivirus.Day_182_184;

import com.demotivirus.Day_182_184.commands.DemoCommandsAndSyntax;
import com.demotivirus.Day_182_184.commands.HelpCommands;
import com.demotivirus.Day_182_184.parser.CreateTable;
import com.demotivirus.Day_182_184.path.settings.PackageCreator;
import com.demotivirus.Day_182_184.path.settings.PathCreator;

import java.util.Scanner;

import static com.demotivirus.Day_182_184.constants.Commands.HELP;
import static com.demotivirus.Day_182_184.constants.Commands.P;
import static com.demotivirus.Day_182_184.constants.Commands.PACKAGE;
import static com.demotivirus.Day_182_184.constants.Commands.PATH;
import static com.demotivirus.Day_182_184.constants.Commands.DEMO;
import static com.demotivirus.Day_182_184.constants.Commands.QUIT;

public class Menu {
    public void readMenu(Scanner scn) {
        CreateTable table = new CreateTable();
        PathCreator pathCreator = new PathCreator();
        String command = "";

        while (scn.hasNextLine()) {
            command = scn.nextLine();
            if (command != null) {
                if (command.equalsIgnoreCase(HELP.getCommand()))
                    HelpCommands.print();
                if (command.startsWith(P.getCommand()) || command.startsWith(PATH.getCommand()))
                    pathCreator.setNewPath(command);
                if (command.startsWith(PACKAGE.getCommand()))
                    PackageCreator.setNewPackage(command);
                if (command.startsWith(DEMO.getCommand()))
                    DemoCommandsAndSyntax.print();
                if (command.toUpperCase().startsWith("CREATE TABLE ")) {
                    table.create(command);
                }
                if (command.startsWith(QUIT.getCommand())) {
                    System.out.println("GENERATE SUCCESS");
                    return;
                }
                //else System.out.println("It's not a command. See --help");
            }
        }
    }
}
