package com.demotivirus.Day_177;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //StringBuilder query = new StringBuilder();
        String command = "";

        System.out.println("""
                USE --help for menu""");

        boolean isWork = true;
        while (isWork) {
            if (scn.hasNextLine()) {
                command = scn.nextLine();

                if (command != null) {
                    if (command.equalsIgnoreCase("--help"))
                        HelpCommands.print();
                    if (command.startsWith("-P") || command.startsWith("--path"))
                        PathCreator.setNewPath(command);
                    if (command.toUpperCase().startsWith("CREATE TABLE ")) {
                        CreateTable.create(command);
                        System.out.println("Continue? [Y]/[N]");
                        if (!scn.nextLine().equalsIgnoreCase("Y"))
                            //isWork = true; //BUG HERE
                            isWork = false;
                    } else {
                        System.out.println("It's not a command. See --help");
                    }
                }
            }
        }
    }
}
