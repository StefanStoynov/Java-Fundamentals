package p01_CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Card Suits: ");
        Arrays.stream(CardSuit.values()).forEach(c->System.out.println(String.format("Ordinal value: %d; Name value: %s",c.ordinal(),c.name())));
    }
}
