package p22_WildFarm;

public class Mouse extends Mammal {


    protected Mouse(String animalType, String animalName, double animalWeight, int foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eatFood(int quantity) {
        super.setFoodEaten(quantity);
    }
}
