package Entities;

import Contracts.Arena;
import Contracts.ComicCharacter;

import java.util.ArrayList;
import java.util.List;

public class ArenaImpl implements Arena {
    private String name;
    private List<ComicCharacter>heroes;
    private List<ComicCharacter>antiHeroes;
    private int capacity;

    public ArenaImpl(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.heroes = new ArrayList<>();
        this.antiHeroes = new ArrayList<>();
    }

    @Override
    public String getArenaName() {
        return this.name;
    }

    @Override
    public boolean isArenaFull() {
       if (this.antiHeroes.size()+ this.heroes.size()>=capacity){
           return true;
       }
       return false;
    }

    public List<ComicCharacter> getHeroes() {
        return this.heroes;
    }

    @Override
    public void addHero(ComicCharacter hero) {
        this.heroes.add(hero);
    }

    @Override
    public void addAntiHero(ComicCharacter antiHero) {

    }

    @Override
    public boolean fightHeroes() {
        return false;
    }
}
