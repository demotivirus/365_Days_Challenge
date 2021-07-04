package com.demotivirus.Day_187_S2.lambda_example.solutions.CodeEvolution_3;

import com.demotivirus.Day_187_S2.lambda_example.Message;
import com.demotivirus.Day_187_S2.lambda_example.Sex;
import com.demotivirus.Day_187_S2.lambda_example.User;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Herman", "Frankfurt", 22, Sex.MALE);
        User user2 = new User(2, "Marianna", "Luxembourg", 24, Sex.FEMALE);

        List<Message> messages = new ArrayList<>();
        messages.add(new Message(1, 123, user1, new Timestamp(System.currentTimeMillis()), "You look a great!"));
        messages.add(new Message(2, 123, user2, new Timestamp(System.currentTimeMillis()), "Hello. Thank you)"));

        run(messages);
    }

    private static void run(List<Message> messages) {
        printMessages(messages, messageLambda -> 123 == messageLambda.getChatId());

        System.out.println("=================================");

        printMessages(messages, messageLambda -> "Frankfurt".equalsIgnoreCase(messageLambda.getUser().getCity()));
    }

    private static void printMessages(List<Message> messages, Predicate<Message> predicate) {
        for (Message message : messages) {
            if (predicate.test(message))
                System.out.println(message);
        }
    }
}
