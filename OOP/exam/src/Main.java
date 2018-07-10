import Contracts.Arena;
import Contracts.ComicCharacter;
import Contracts.SuperPower;
import Entities.*;
import Manager.WarManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        WarManager warManager = new WarManager();
        String line;
        while (true) {
            if ("WAR_IS_OVER".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");

            String command = tokens[0];

            switch (command) {
                case "CHECK_CHARACTER":
                    String characterName = tokens[1];
                    if (warManager.getHeroes().get(characterName).getHealth() <= 0) {
                        System.out.println(String.format("%s has fallen in battle!", characterName));
                    }
                    if (!warManager.getHeroes().containsKey(characterName)) {
                        System.out.println(String.format("Sorry, fans! %s doesn't exist in our comics!", characterName));
                    }
                    System.out.println(warManager.checkComicCharacter(characterName));
                    break;
                case "REGISTER_HERO":
                    String heroName = tokens[1];
                    String type = tokens[2];
                    int energy = Integer.parseInt(tokens[3]);
                    double health = Double.parseDouble(tokens[4]);
                    double intelligence = Double.parseDouble(tokens[5]);
                    double heroism = Double.parseDouble(tokens[6]);
                    try {
                        if (type.equals("MarvelHero")) {
                            ComicCharacter marvelHero = new MarvelHero(heroName, energy, health, intelligence, heroism);
                            System.out.println(warManager.addHero(marvelHero));
                        } else if (type.equals("DCHero")) {
                            ComicCharacter dcHero = new DCHero(heroName, energy, health, intelligence, heroism);
                            System.out.println(warManager.addHero(dcHero));
                        }
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "REGISTER_ANTI_HERO":
                    String antiHeroName = tokens[1];
                    String antiHeroType = tokens[2];
                    int antiHeroEnergy = Integer.parseInt(tokens[3]);
                    double antiHeroHealth = Double.parseDouble(tokens[4]);
                    double antiHeroIntelligence = Double.parseDouble(tokens[5]);
                    double evilness = Double.parseDouble(tokens[6]);
                    try {
                        if (antiHeroType.equals("Villain")) {
                            ComicCharacter villain = new Villain(antiHeroName, antiHeroEnergy, antiHeroHealth, antiHeroIntelligence, evilness);
                            System.out.println(warManager.addAntiHero(villain));
                        } else if (antiHeroType.equals("Titan")) {
                            ComicCharacter titan = new Titan(antiHeroName, antiHeroEnergy, antiHeroHealth, antiHeroIntelligence, evilness);
                            System.out.println(warManager.addAntiHero(titan));
                        }

                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "BUILD_ARENA":
                    String areanaName = tokens[1];
                    int capacity = Integer.parseInt(tokens[2]);
                    Arena arena = new ArenaImpl(areanaName, capacity);
                    System.out.println(warManager.addArena(arena));
                    break;
                case "SEND_HERO":
                    String arenaName = tokens[1];
                    String hero = tokens[2];
                    System.out.println(warManager.addHeroToArena(arenaName, hero));
                    break;
                case "SEND_ANTI_HERO":
                    String arenaName1 = tokens[1];
                    String antiHero = tokens[2];
                    System.out.println(warManager.addAntiHeroToArena(arenaName1, antiHero));
                    break;
                case "SUPER_POWER":
                    String powerName = tokens[1];
                    double powerPoints = Double.parseDouble(tokens[2]);
                    try {
                        SuperPower power = new Power(powerName, powerPoints);
                        System.out.println(warManager.loadSuperPowerToPool(power));
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "ASSIGN_POWER":
                    String comicHero = tokens[1];
                    String superPowerName = tokens[2];
                    System.out.println(warManager.assignSuperPowerToComicCharacter(comicHero, superPowerName));
                    break;
                case "UNLEASH":
                    String heroName3 = tokens[1];
                    System.out.println(warManager.usePowers(heroName3));
                    break;
                case "COMICS_WAR":
                    String arenaNam = tokens[1];
                    System.out.println(warManager.startBattle(arenaNam));
                    break;
            }
        }
    }
}
