package Entities;

public abstract class AntiHero extends ComicCharacterImpl {
    private double evilness;

    public AntiHero(String name, int energy, double health, double intelligence, double evilness) {
        super(name, energy, health, intelligence);
        this.setEvilness(evilness);
    }

    public void setEvilness(double evilness) {
        if (evilness >= 0) {
            this.evilness = evilness;
        } else {
            throw new IllegalArgumentException("Evilness should be a possitive number!");
        }
    }

    @Override
    public double getSpecial() {
        return this.evilness;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(System.lineSeparator())
                .append(String.format("###Evilness: %.2f",this.evilness));
        return sb.toString();
    }
}
