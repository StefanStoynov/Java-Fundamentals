package p22_WildFarmExtend.animals.animal;

import p22_WildFarmExtend.animals.food.Food;
import p22_WildFarmExtend.animals.food.Meat;

public class Mouse extends Mammal {
    public Mouse(String name, double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
        super.eat(food);
    }
}