package Entities;

import Contracts.SuperPower;

public class Villain extends AntiHero {
    public Villain(String name, int energy, double health, double intelligence, double evilness) {
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
        //•	Villain: attack power  = (intelligence * special) / energy.
        return (super.getIntelligence()*super.getSpecial())/super.getEnergy();
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
                .append(String.format("####Villain Attack Power: %.2f",this.attack()));
        return sb.toString();
    }
}
