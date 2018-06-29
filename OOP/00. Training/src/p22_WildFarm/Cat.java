package p22_WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    protected Cat(String animalType, String animalName, double animalWeight, int foodEaten, String livingRegion,String breed) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eatFood(int quantity) {
        super.setFoodEaten(quantity);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##########################");
        return String.format("%s[%s, %s, %s, %s, %d]", this.getAnimalType()
                , this.getAnimalName(),
                this.breed,
                df.format(this.getAnimalWeight()),
                this.getLivingRegion(),
                this.getFoodEaten());
    }

}
