package p08_PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Trainer> players = new LinkedHashMap<>();
        String line;
        while (true) {
            if ("Tournament".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);
            if (players.containsKey(trainerName)) {
                Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
                players.get(trainerName).getPokemons().add(pokemon);
            } else {
                Trainer trainer = new Trainer(trainerName, 0, new LinkedList<>());
                players.putIfAbsent(trainerName, trainer);
                Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
                trainer.getPokemons().add(pokemon);
            }

        }


        while (true) {
            if ("End".equals(line = reader.readLine())) {
                break;
            }
            String command = line;
            if ("Fire".equals(command) || "Water".equals(command) || "Electricity".equals(command)) {
                players.entrySet().stream().forEach(tr -> {
                    if (tr.getValue().getPokemons().stream().anyMatch(p -> command.equals(p.getElement()))) {
                        tr.getValue().setNumberOfBadges(tr.getValue().getNumberOfBadges() + 1);
                    }else{
                        tr.getValue().loseHelth();
                    }
                });
            }


        }
        players
                .entrySet()
                .stream()
                .sorted((tr1,tr2)-> Integer.compare(tr2.getValue().getNumberOfBadges(), tr1.getValue().getNumberOfBadges()))
                .forEach(p-> System.out.println(String.format("%s %d %d",p.getKey(),p.getValue().getNumberOfBadges(),p.getValue().getPokemons().size())));
    }
}
