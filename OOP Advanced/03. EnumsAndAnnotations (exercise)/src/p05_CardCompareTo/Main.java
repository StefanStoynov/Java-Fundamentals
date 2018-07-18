package p05_CardCompareTo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String cardRank1 = reader.readLine();
        String cardSuit1 = reader.readLine();

        String cardRank2 = reader.readLine();
        String cardSuit2 = reader.readLine();

        Card card = new Card(cardRank1,cardSuit1);
        Card card1 = new Card(cardRank2,cardSuit2);
        String output = card.compareTo(card1) > 0 ? card.toString(): card1.toString();
        System.out.println(output);
    }
}
