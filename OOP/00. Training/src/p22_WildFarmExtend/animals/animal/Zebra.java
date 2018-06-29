package p22_WildFarmExtend.animals.animal;

import p22_WildFarmExtend.animals.food.Food;
import p22_WildFarmExtend.animals.food.Meat;

public class Zebra extends Mammal {
    public Zebra(String name, double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        super.eat(food);
    }
}