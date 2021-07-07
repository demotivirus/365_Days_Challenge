package com.demotivirus.Day_182_190.commands;

public class DemoHotCommands {
    public static void print() { //todo 06.07 - add commands in parser
        System.out.println("""
                MODIFIERS
                -a          abstract
                -p          public
                -d          default
                -pr         protected
                -s          static
                -f          final
                -ps         public static
                -psf        public static final
                
                METHODS
                --psmv      main method
                
                CLASSES
                --i         interface
                --e         enum
                """);
    }
}
