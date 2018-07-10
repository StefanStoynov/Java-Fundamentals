package Entities;

import Contracts.SuperPower;

public class Titan extends AntiHero {
    public Titan(String name, int energy, double health, double intelligence, double evilness) {
        super(name, energy, health, intelligence, evilness);
    }


    @Override
    public void takeDamage(double damage) {

    }

    @Override
    public void boostCharacter(int energy, double health, double intelligence) {

    }

    @Override
    public double attack() {
        //•	Titan: attack power  = (energy + intelligence + special)  * 3.
        return (super.getEnergy()+super.getIntelligence()+super.getSpecial())*3;
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
                .append(String.format("####Titan Attack Power:  %.2f",this.attack()));
        return sb.toString();
    }
}
