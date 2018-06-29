package p22_WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;


    protected Mammal(String animalType, String animalName, double animalWeight, int foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df =new DecimalFormat("#.##########################");
        return String.format("%s[%s, %s, %s, %d]",this.getAnimalType(),super.getAnimalName(),df.format(this.getAnimalWeight()),this.livingRegion,super.getFoodEaten());
    }
}
