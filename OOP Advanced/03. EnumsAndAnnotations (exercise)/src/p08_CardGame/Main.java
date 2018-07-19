package p08_CardGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstName = reader.readLine();
        String secondName = reader.readLine();

        Player player1 = new Player(firstName);
        Player player2 = new Player(secondName);
        Game game= new Game(player1,player2);

        Deck deck = new Deck();
        while (true) {
            if (player1.getHandSize()==5 && player2.getHandSize()==5) {
                break;
            }
            String[] cardTokens = reader.readLine().split(" of ");
            Card card;
            try {
                CardRanks cardRanks = CardRanks.valueOf(cardTokens[0]);
                CardSuits cardSuits = CardSuits.valueOf(cardTokens[1]);
                card = new Card(cardRanks, cardSuits);
            }catch (IllegalArgumentException iae){
                System.out.println("No such card exists.");
                continue;
            }
            if (!deck.isCardExist(card)){
                System.out.println("Card is not in the deck.");
                continue;
            }
            deck.cardRemove(card);

            if (player1.getHandSize()<5) {
                player1.addCard(card);
            }else if (player2.getHandSize()<5){
                player2.addCard(card);
            }


        }
        Player winner = game.winner();
        System.out.println(String.format("%s wins with %s.",winner.getName(),winner.strongestCard()));

    }
}
