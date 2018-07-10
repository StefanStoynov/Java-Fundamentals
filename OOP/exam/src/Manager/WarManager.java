package Manager;

import Contracts.Arena;
import Contracts.ComicCharacter;
import Contracts.Manager;
import Contracts.SuperPower;

import java.util.LinkedHashMap;
import java.util.Map;

public class WarManager implements Manager {
    private Map<String, ComicCharacter> heroes;
    private Map<String, Arena> arenas;
    private Map<String, SuperPower> powers;

    public WarManager() {
        this.heroes = new LinkedHashMap<>();
        this.arenas = new LinkedHashMap<>();
        this.powers = new LinkedHashMap<>();
    }


    public Map<String, ComicCharacter> getHeroes() {
        return this.heroes;
    }

    @Override
    public String checkComicCharacter(String characterName) {
        return heroes.get(characterName).toString();
    }

    @Override
    public String addHero(ComicCharacter hero) {

        if (heroes.containsKey(hero.getName())) {
            heroes.put(hero.getName(), hero);
            return String.format("%s evolved!", hero.getName());
        } else {
            heroes.put(hero.getName(), hero);
            return String.format("%s is ready for battle!", hero.getName());
        }
    }

    @Override
    public String addAntiHero(ComicCharacter antiHero) {
        if (!heroes.containsKey(antiHero.getName())) {
            heroes.put(antiHero.getName(), antiHero);
            return String.format("%s is ready for destruction! ", antiHero.getName());
        } else {
            heroes.put(antiHero.getName(), antiHero);
            return String.format("%s is getting stronger!", antiHero.getName());
        }

    }

    @Override
    public String addArena(Arena arena) {
        if (arenas.containsKey(arena.getArenaName())) {
            return "A battle is about to start there!";
        } else {
            arenas.put(arena.getArenaName(), arena);
            return String.format("%s is becoming a fighting ground!", arena.getArenaName());
        }
    }

    @Override
    public String addHeroToArena(String arena, String hero) {
        Arena arena1 = this.arenas.get(arena);
        ComicCharacter hero1 = this.heroes.get(hero);
        if (arenas.containsKey(hero)) {
            return String.format("%s is fighting!", hero);
        } else if (hero1.getHealth() <= 0) {
            heroes.remove(hero1);
            return String.format("%s is dead!", hero1.getName());
        } else if (arena1.isArenaFull()) {
            return "Arena is full!";
        } else {
            arena1.addHero(hero1);
            return String.format("%s is fighting for your freedom in %s!", hero1.getName(), arena1.getArenaName());
        }
    }

    @Override
    public String addAntiHeroToArena(String arena, String antiHero) {
        Arena arena1 = this.arenas.get(arena);
        ComicCharacter hero1 = this.heroes.get(antiHero);
        if (arenas.containsKey(antiHero)) {
            return String.format("%s is fighting!", antiHero);
        } else if (hero1.getHealth() <= 0) {
            heroes.remove(hero1);
            return String.format("%s is dead!", hero1.getName());
        } else if (arena1.isArenaFull()) {
            return "Arena is full!";
        } else {
            arena1.addHero(hero1);
            return String.format("%s and his colleagues are trying to take over %s!", antiHero, arena1.getArenaName());
        }
    }

    @Override
    public String loadSuperPowerToPool(SuperPower superPower) {
        if (powers.containsKey(superPower.getName())){
            return "This super power already exists!";
        }else{
            powers.put(superPower.getName(),superPower);
            return String.format("%s added to pool!",superPower.getName());
        }
    }

    @Override
    public String assignSuperPowerToComicCharacter(String comicCharacter, String superPower) {
        ComicCharacter hero2 = this.heroes.get(comicCharacter);
        SuperPower power = this.powers.get(superPower);

        if (hero2.getPowers().containsKey(superPower)){
            return String.format("%s already assigned!",superPower);
        }else{
            hero2.getPowers().put(superPower,power);
            return String.format("%s has a new super power!",comicCharacter);
        }
    }

    @Override
    public String usePowers(String characterName) {
        if (heroes.get(characterName).getPowers().size()!=0){
            return String.format("%s used his super powers!",characterName);
        }else{
            return String.format("%s has no super powers!",characterName);
        }
    }

    @Override
    public String startBattle(String arena) {
        Arena arena2 = this.arenas.get(arena);
        if (arena2.getHeroes().size() == 0){
            return "SAFE ZONE!";
        }else{
            return String.format("Heroes won the battle of %s!",arena);
        }
    }

    @Override
    public String endWar() {
        return null;
    }
}
