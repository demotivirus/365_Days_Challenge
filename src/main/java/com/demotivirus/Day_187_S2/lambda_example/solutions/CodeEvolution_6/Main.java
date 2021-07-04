package com.demotivirus.Day_187_S2.lambda_example.solutions.CodeEvolution_6;

import com.demotivirus.Day_187_S2.lambda_example.Message;
import com.demotivirus.Day_187_S2.lambda_example.Sex;
import com.demotivirus.Day_187_S2.lambda_example.User;
import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@Slf4j
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
        process(messages,
                messageLambda -> 123 == messageLambda.getChatId(),
                messageFromLambda -> messageFromLambda.getText(),
                textFromMessage -> System.out.println(textFromMessage));

        System.out.println("=================================");

        process(messages,
                messageLambda -> "Frankfurt".equalsIgnoreCase(messageLambda.getUser().getCity()),
                messageFromLambda -> messageFromLambda.getText(),
                textFromMessage -> log.info(textFromMessage)); //add new void print variant
    }

    private static <T, R> void process(Iterable<T> elements,
                                       Predicate<T> predicate,
                                       Function<T, R> mapper,
                                       Consumer<R> consumer) {
        for (T t : elements) {
            if (predicate.test(t)) {
                R data = mapper.apply(t);
                consumer.accept(data);
            }
        }
    }
}
