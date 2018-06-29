package p22_WildFarm;

public class Tiger extends Felime {


    protected Tiger(String animalType, String animalName, double animalWeight, int foodEaten, String livingRegion) {
        super(animalType, animalName, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eatFood(int quantity) {
        super.setFoodEaten(quantity);
    }
}
