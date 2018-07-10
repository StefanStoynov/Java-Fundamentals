package Entities;

import Contracts.SuperPower;

import javax.print.DocFlavor;

public class DCHero extends Hero {
    public DCHero(String name, int energy, double health, double intelligence, double heroism) {
        super(name, energy, health, intelligence, heroism);
    }


    @Override
    public void takeDamage(double damage) {

    }

    @Override
    public void boostCharacter(int energy, double health, double intelligence) {

    }

    @Override
    public double attack() {
        //•	DCHero: attack power  = energy / 1.5 + special + intelligence.
        return (super.getEnergy()/1.5) + super.getSpecial() + super.getIntelligence();
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
                .append(String.format("####DC Attack Power: %.2f",this.attack()));
        return sb.toString();
    }
}
