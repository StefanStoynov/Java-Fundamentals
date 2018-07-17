package p02_CardRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Card Ranks:");
        Arrays
                .stream(CardRanks.values())
                .forEach(cardRanks -> System.out.println(String.format("Ordinal value: %d; Name value: %s",cardRanks.ordinal(),cardRanks.name())));
    }
}
