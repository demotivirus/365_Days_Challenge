package com.demotivirus.Day_182_189;

import com.demotivirus.Day_182_189.commands.DemoBugCommands;
import com.demotivirus.Day_182_189.commands.DemoCommandsAndSyntax;
import com.demotivirus.Day_182_189.commands.DemoHotCommands;
import com.demotivirus.Day_182_189.commands.HelpCommands;
import com.demotivirus.Day_182_189.parser.CreateTableParser;
import com.demotivirus.Day_182_189.path.settings.PackageCreator;
import com.demotivirus.Day_182_189.path.settings.PathCreator;

import java.util.Scanner;

import static com.demotivirus.Day_182_189.constants.Command.BUG_COMMANDS_DEMO;
import static com.demotivirus.Day_182_189.constants.Command.HOT_COMMANDS;
import static com.demotivirus.Day_182_189.constants.Command.DEMO;
import static com.demotivirus.Day_182_189.constants.Command.HELP;
import static com.demotivirus.Day_182_189.constants.Command.P;
import static com.demotivirus.Day_182_189.constants.Command.PACKAGE;
import static com.demotivirus.Day_182_189.constants.Command.PATH;
import static com.demotivirus.Day_182_189.constants.Command.QUIT;

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
                if (command.toUpperCase().startsWith("CREATE TABLE ")) {
                    parser.parseQuery(command);
                }
                else if (command.equalsIgnoreCase(HELP.getCommand()))
                    HelpCommands.print();
                else if (command.startsWith(P.getCommand()) || command.startsWith(PATH.getCommand()))
                    pathCreator.setNewPath(command);
                else if (command.startsWith(PACKAGE.getCommand()))
                    PackageCreator.setNewPackage(command);
                else if (command.startsWith(DEMO.getCommand()))
                    DemoCommandsAndSyntax.print();
                else if (command.startsWith(BUG_COMMANDS_DEMO.getCommand()))
                    DemoBugCommands.print();
                else if (command.startsWith(HOT_COMMANDS.getCommand()))
                    DemoHotCommands.print();
                else if (command.startsWith(QUIT.getCommand())) {
                    System.out.println("GENERATE SUCCESS");
                    return;
                }
                else System.out.println("It's not a command. See --help");
            }
        }
    }
}
