package p07_DeckOfCards;


public class Card {
    private CardRanks card;
    private CardSuits suit;

    public Card(CardRanks card, CardSuits suit) {
        this.card = card;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.card, this.suit);
    }



}
