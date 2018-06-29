package p22_WildFarm;

public class Zebra extends Mammal {


    protected Zebra(String animalType, String animalName, double animalWeight, int foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eatFood(int quantity) {
        super.setFoodEaten(quantity);
    }
}