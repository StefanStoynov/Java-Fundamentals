package p04_CardToString;

public class Card {
    private CardRanks card;
    private CardSuits suit;

    public Card(String card, String suit) {
        this.card = CardRanks.valueOf(card.toUpperCase());
        this.suit = CardSuits.valueOf(suit.toUpperCase());
    }

    private int getPower(){
        int cardPower = this.card.getCardPower();
        int suitPower = this.suit.getSuitPower();
        return cardPower+suitPower;
    }



    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.card, this.suit, this.getPower());
    }
}
