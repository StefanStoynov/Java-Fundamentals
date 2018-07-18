package p06_CustomEnumAnnotation;
@CustomAnnotation(category = "Suit", description = "Provides suit constants for a Card class.")
public enum CardSuits {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);
    int suitPower;

    CardSuits(int suitPower) {
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return this.suitPower;
    }
}
