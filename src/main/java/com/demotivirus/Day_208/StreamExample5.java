package com.demotivirus.Day_208;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamExample5 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        boolean isAnyTraderHasInMilan = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println("isAnyTraderHasInMilan: " + isAnyTraderHasInMilan);

        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        Optional<Integer> minSum = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        System.out.println("MinSum: " + minSum.get());

        Optional<Integer> totalSum = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::sum);
        System.out.println("Total sum: " + totalSum.get());

        Optional<Transaction> smallestSumToo = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println("SmallestSumToo: " + smallestSumToo.get());
    }
}
