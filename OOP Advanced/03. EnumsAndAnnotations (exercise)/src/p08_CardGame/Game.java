package p08_CardGame;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player winner(){
        if (this.player1.strongestCard().compareTo(this.player2.strongestCard()) >0){
            return this.player1;
        }else {
            return this.player2;
        }
    }
}
