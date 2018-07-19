package p08_CardGame;


public class Card implements Comparable<Card> {
    private CardRanks card;
    private CardSuits suit;

    public Card(CardRanks card, CardSuits suit) {
        this.card = card;
        this.suit = suit;
    }

    public CardRanks getCard() {
        return this.card;
    }

    public CardSuits getSuit() {
        return this.suit;
    }

    private int getPower(){
        int cardPower = this.card.getCardPower();
        int suitPower = this.suit.getSuitPower();
        return cardPower+suitPower;
    }

    @Override
    public int compareTo(Card other) {
        return this.getPower() - other.getPower();
    }

    @Override
    public String toString() {
        return String.format("%s of %s", this.card, this.suit);
    }



}
