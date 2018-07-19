package p08_CardGame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Deck implements Iterable<Card> {
    List<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
        this.deckOfCards();
    }

    private void deckOfCards() {
        for (CardSuits cardSuits : CardSuits.values()) {
            for (CardRanks cardRanks : CardRanks.values()) {
                Card card = new Card(cardRanks, cardSuits);
                deck.add(card);
            }
        }
    }

    public boolean isCardExist(Card card) {
        return this.deck
                .stream()
                .anyMatch(card1 -> card1.getCard().equals(card.getCard())
                        && card1.getSuit().equals(card.getSuit()));
    }

    public void cardRemove(Card card){
        this.deck.removeIf(card1 -> card1.getCard().equals(card.getCard())
                && card1.getSuit().equals(card.getSuit()));
    }

    @Override
    public Iterator<Card> iterator() {
        return new DeckIterator();
    }

    private final class DeckIterator implements Iterator<Card> {
        private int cursor;

        public DeckIterator() {
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return deck.size() != this.cursor;
        }

        @Override
        public Card next() {
            return deck.get(cursor++);
        }
    }
}
