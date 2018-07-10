package Entities;

public abstract class Hero extends ComicCharacterImpl {
    private double heroism;
    public Hero(String name, int energy, double health, double intelligence, double heroism) {
        super(name, energy, health, intelligence);
        this.setHeroism(heroism);
    }

    public void setHeroism(double heroism) {
        if (heroism>=0){
            this.heroism = heroism;
        }
        else {
            throw new IllegalArgumentException("Heroism should be a possitive number!");
        }

    }

    @Override
    public double getSpecial() {
        return this.heroism;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(System.lineSeparator())
                .append(String.format("###Heroism: %.2f",this.heroism));
        return sb.toString();
    }
}
