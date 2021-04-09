package com.demotivirus.Day_108;

public class Main {
    public static void main(String[] args) {
        AbstractNotifier emailNotify = new EmailNotifier(Priority.ALL);
        AbstractNotifier smsNotify = new SmsNotifier(Priority.ERROR);
        AbstractNotifier radioNotify = new RadioNotifier(Priority.FATAL);

        //CHAIN OF RESPONSIBILITY
        emailNotify.setNextNotifier(smsNotify);
        smsNotify.setNextNotifier(radioNotify);

        emailNotify.manager("ALl is OK", Priority.ALL);
        System.out.println("================================");
        emailNotify.manager("Fatal error... Delete the DB sector...", Priority.FATAL);
        System.out.println("================================");
        emailNotify.manager("I have a bad news - you code like s*t", Priority.ERROR);
    }
}
