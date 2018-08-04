package p21_CoffeeMachine;

import p21_CoffeeMachine.enums.CoffeeSize;
import p21_CoffeeMachine.enums.CoffeeType;

public class Coffee {
    private CoffeeSize size;
    private CoffeeType type;

    public Coffee(String size, String type) {
        this.size = CoffeeSize.valueOf(CoffeeSize.class, size.toUpperCase());
        this.type = CoffeeType.valueOf(CoffeeType.class, type.toUpperCase());
    }

    @Override
    public String toString() {
        return this.size.toString() + " " + this.type.toString();
    }
}
