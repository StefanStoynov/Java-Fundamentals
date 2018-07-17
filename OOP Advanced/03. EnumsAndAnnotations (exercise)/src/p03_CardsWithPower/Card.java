package p03_CardsWithPower;

public class Card {
    private String card;
    private String suit;

    public Card(String card, String suit) {
        this.card = card;
        this.suit = suit;
    }

    private int getPower(){
        int cardPower = CardRanks.valueOf(card).getCardPower();
        int suitPower = CardSuits.valueOf(suit).getSuitPower();
        return cardPower+suitPower;
    }



    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.card, this.suit, this.getPower());
    }
}
