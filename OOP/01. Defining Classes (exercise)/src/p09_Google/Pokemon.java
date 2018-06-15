package p09_Google;

public class Pokemon {
    //pokemon <pokemonName> <pokemonType>
    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }
    public String getPokemonName() {
        return this.pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }



    @Override
    public String toString() {
        return String.format("%s %s", this.pokemonName, this.pokemonType);
    }
}
