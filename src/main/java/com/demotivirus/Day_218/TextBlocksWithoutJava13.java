package com.demotivirus.Day_218;

public class TextBlocksWithoutJava13 {
    private static final String LS = System.lineSeparator(); // \r\n

    public static void main(String[] args) {
        String text1 = new StringBuilder()
                .append("My high school, ").append(LS)
                .append("the Illinois Mathematics and Science Academy,").append(LS)
                .append("showed me that anything is possible ").append(LS)
                .append("and that you're never too young to think big.")
                .toString();

        String text2 = String.join(LS,
                "My high school, ",
                "the Illinois Mathematics and Science Academy,",
                "showed me that anything is possible ",
                "and that you're never too young to think big.");
        System.out.println(text2);

        String text3 = String.format("%s" + LS + "%s" + LS + "%s" + LS + "%s",
                "My high school, ",
                "the Illinois Mathematics and Science Academy,",
                "showed me that anything is possible ",
                "and that you're never too young to think big.");
        System.out.println("Text 4:" + LS + text3);
    }
}
