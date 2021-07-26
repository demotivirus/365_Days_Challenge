package com.demotivirus.Day_208;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample4 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> findAllTransactionIn2011AndSortForSum = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println("FindAllTransactionIn2011AndSortForSum: " + findAllTransactionIn2011AndSortForSum);

        List<String> findAllUniqCities = transactions.stream()
                //.map(Transaction::getTrader)
                //.map(Trader::getCity)
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("FindAllUniqCities: " + findAllUniqCities);

        Set<String> set = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());
        System.out.println("Set" + set);

        List<Trader> allTraderInCambridgeAndSortByName = transactions.stream()
                .map(Transaction::getTrader)
                .distinct() //get only uniq
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println("AllTraderInCambridgeAndSortByName: " + allTraderInCambridgeAndSortByName);

        String getAllSortedTraderNames = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted()
                .distinct()
                .reduce("", (n1, n2) -> n1.concat(n2));
        System.out.println("GetAllSortedTraderNames: " + getAllSortedTraderNames);
    }
}
