package p07_DeckOfCards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CardDeck implements Iterable<Card> {
    private List<Card> deck;

    public CardDeck() {
        this.deck = new ArrayList<>();
        this.seedDeck();
    }


    private void seedDeck() {
        for (CardSuits cardSuits : CardSuits.values()) {
            for (CardRanks cardRanks : CardRanks.values()) {
                Card card = new Card(cardRanks, cardSuits);
                this.deck.add(card);
            }
        }
    }

    @Override
    public Iterator<Card> iterator() {
        return new DeckIterator();
    }

    private final class DeckIterator implements Iterator<Card> {
        private int cusor;

        public DeckIterator() {
            this.cusor = 0;
        }


        @Override
        public boolean hasNext() {
            return deck.size() != this.cusor;
        }

        @Override
        public Card next() {
            return deck.get(this.cusor++);
        }
    }
}
