package org.example.exercices.stream;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {


    public static void main(String[] args) {


        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 400),
                new Transaction(brian, 2012, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));


        // Question 1 -

        List<Transaction> tr2011 =
                transactions.stream()
                        .filter(transaction -> transaction.getYear() == 2011)
                        .sorted(Comparator.comparing(Transaction::getValue))
                        .collect(Collectors.toList());

        // Question 2 -

        List<String> cities =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .distinct()
                        .collect(Collectors.toList());

        //version 2 :

        Set<String> citie2s =
                transactions.stream()
                        .map(Transaction::getTrader)
                        .map(Trader::getCity)
                        .collect(Collectors.toSet());


        // Question 3 -

        String traderStr =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);

        // Question 4 -

        boolean milanBased =
                transactions.stream()
                        .anyMatch(transaction -> transaction.getTrader()
                                .getCity()
                                .equals("Milan"));

        // Question 5 -


        // version 1 -

        OptionalInt highestValue =
                transactions.stream()
                        .mapToInt(Transaction::getValue)
                        .max();

        Integer valuer = highestValue.getAsInt();


        // version 2 -

        Optional<Integer> highestValue2 =
                transactions.stream()
                        .map(Transaction::getValue)
                        .max(Comparator.comparing(Integer::intValue));

        // version 3 -

        Optional<Integer> highestValue3 =
                transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(Integer::max);


        // Question 6

        List<Trader> traders =
                transactions.stream()
                        .map(transaction -> transaction.getTrader())
                        .filter(trader -> trader.getCity().equals("Cambridge"))
                        .distinct()
                        .sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());


        // Question 7 :

        List<Integer> values =
                transactions.stream()
                        .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                        .map(Transaction::getValue)
                        .collect(Collectors.toList());


        // Question 8 :

        Optional<Transaction> smallestTransaction =
                transactions.stream()
                        .min(Comparator.comparing(Transaction::getValue));


    }

}
