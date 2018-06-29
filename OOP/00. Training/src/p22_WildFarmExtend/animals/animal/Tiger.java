package p22_WildFarmExtend.animals.animal;

import p22_WildFarmExtend.animals.food.Food;
import p22_WildFarmExtend.animals.food.Vegetable;

public class Tiger extends Feline {
    public Tiger(String name, double weight, String region) {
        super(name, weight, region);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eat(food);
    }
}
