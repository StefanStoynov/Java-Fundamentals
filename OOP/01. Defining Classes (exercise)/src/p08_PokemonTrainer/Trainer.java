package p08_PokemonTrainer;

import java.util.List;

public class Trainer {

    private String trainerName;
    private int numberOfBadges;
    private List<Pokemon>pokemons;

    public Trainer(String trainerName, int numberOfBadges, List<Pokemon> pokemons) {
        this.trainerName = trainerName;
        this.numberOfBadges = numberOfBadges;
        this.pokemons = pokemons;
    }

    public String getTrainerName() {
        return this.trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public int getNumberOfBadges() {
        return this.numberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    public void loseHelth(){
        for (Pokemon pokemon : pokemons) {
            pokemon.setHealth(pokemon.getHealth()-10);
            if (pokemon.getHealth()<=0){
                pokemons.remove(pokemon);
            }
        }
    }
}
