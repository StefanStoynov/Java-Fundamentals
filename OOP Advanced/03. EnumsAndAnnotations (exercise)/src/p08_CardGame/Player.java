package p08_CardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card>hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addCard(Card card){
        this.hand.add(card);
    }

    public Card strongestCard(){
       Card strong = this.hand.stream().max(Card::compareTo).get();
       return strong;
    }

    public List<Card> getHand() {
        return this.hand;
    }

    public int getHandSize(){
       return this.hand.size();
    }
}
