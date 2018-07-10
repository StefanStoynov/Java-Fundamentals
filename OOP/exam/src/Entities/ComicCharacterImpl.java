package Entities;

import Contracts.ComicCharacter;
import Contracts.SuperPower;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public abstract class ComicCharacterImpl implements ComicCharacter {
    private String name;
    private int energy;
    private double health;
    private double intelligence;
    private Map<String,SuperPower> powers;

    public ComicCharacterImpl(String name, int energy, double health, double intelligence) {
        this.setName(name);
        this.setEnergy(energy);
        this.setHealth(health);
        this.setIntelligence(intelligence);
        this.powers = new LinkedHashMap<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getEnergy() {
        return this.energy;
    }

    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public double getIntelligence() {
        return this.intelligence;
    }

    @Override
    public Map<String, SuperPower> getPowers() {
        return this.powers;
    }

    public void setName(String name) {
        String patern = "[A-Za-z]+_*[A-Za-z]+";
        if (patern.matches(name) || name.length() >= 2 && name.length() <= 12) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Comic Character name is not in the correct format!");
        }

    }

    public void setEnergy(int energy) {
        if (energy >= 0 && energy <= 300) {
            this.energy = energy;
        } else {
            throw new IllegalArgumentException("Energy is not in the correct range!");
        }

    }

    public void setHealth(double health) {
        if (health >= 0) {
            this.health = health;
        } else {
            throw new IllegalArgumentException("Health should be a possitive number!");
        }

    }

    public void setIntelligence(double intelligence) {
        if (intelligence >= 0 && intelligence <= 200) {
            this.intelligence = intelligence;
        } else {
            throw new IllegalArgumentException("Intelligence is not in the correct range!");
        }

    }

    public abstract double getSpecial();

    public abstract double attack();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("#Name: %s", this.name)).append(System.lineSeparator())
                .append(String.format("##Health: %.2f// Energy: %d// Intelligence: %.2f"
                        , this.health
                        , this.energy
                        , this.intelligence));
        return sb.toString();
    }
}
