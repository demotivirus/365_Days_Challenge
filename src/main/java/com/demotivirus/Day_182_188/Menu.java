package com.demotivirus.Day_182_188;

import com.demotivirus.Day_182_188.commands.DemoBugCommands;
import com.demotivirus.Day_182_188.commands.DemoCommandsAndSyntax;
import com.demotivirus.Day_182_188.commands.HelpCommands;
import com.demotivirus.Day_182_188.parser.CreateTableParser;
import com.demotivirus.Day_182_188.path.settings.PackageCreator;
import com.demotivirus.Day_182_188.path.settings.PathCreator;

import java.util.Scanner;

import static com.demotivirus.Day_182_188.constants.Command.BUG_COMMANDS_DEMO;
import static com.demotivirus.Day_182_188.constants.Command.DEMO;
import static com.demotivirus.Day_182_188.constants.Command.HELP;
import static com.demotivirus.Day_182_188.constants.Command.P;
import static com.demotivirus.Day_182_188.constants.Command.PACKAGE;
import static com.demotivirus.Day_182_188.constants.Command.PATH;
import static com.demotivirus.Day_182_188.constants.Command.QUIT;

public class Menu {
    public static void main(String[] args) {
        CreateTableParser parser = new CreateTableParser();
        PathCreator pathCreator = new PathCreator();
        Scanner scn = new Scanner(System.in);
        String command = "";

        System.out.println("USE --help for menu");
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
                if (command.startsWith(BUG_COMMANDS_DEMO.getCommand()))
                    DemoBugCommands.print();
                if (command.toUpperCase().startsWith("CREATE TABLE ")) {
                    parser.parseQuery(command);
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
