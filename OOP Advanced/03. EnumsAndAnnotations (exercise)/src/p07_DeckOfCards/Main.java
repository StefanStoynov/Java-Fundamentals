package p07_DeckOfCards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CardDeck cards = new CardDeck();

        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
