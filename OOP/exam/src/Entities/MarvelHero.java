package Entities;

import Contracts.SuperPower;

public class MarvelHero extends Hero {
    public MarvelHero(String name, int energy, double health, double intelligence, double heroism) {
        super(name, energy, health, intelligence, heroism);
    }

    @Override
    public void takeDamage(double damage) {

    }

    @Override
    public void boostCharacter(int energy, double health, double inteligence) {

    }

    @Override
    public double attack() {
        return ((super.getEnergy()+super.getSpecial())* super.getIntelligence())/2.5;
    }

    @Override
    public String useSuperPowers() {
        return null;
    }

    @Override
    public void addSuperPower(SuperPower superPower) {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(System.lineSeparator())
                .append(String.format("####Marvel Attack Power: %.2f",this.attack()));
        return sb.toString();
    }
}
