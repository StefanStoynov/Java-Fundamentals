package p17_PizzaCalories;

import java.util.HashMap;
import java.util.Map;

public class Topping {
    private static final Map<String, Double> TOPPING_MODIFIERES = new HashMap<>() {{
        put("Meat", 1.2);
        put("Veggies", 0.8);
        put("Cheese", 1.1);
        put("Sauce", 0.9);
    }};
    private String toppingType;
    private double weight;

    protected Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (TOPPING_MODIFIERES.containsKey(toppingType)) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }

    private void setWeight(double weight) {
        if (weight > 1 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].",this.toppingType));
        }
    }

    public double toppingCalorie(){
        double calories;
        calories = (2*this.weight)*TOPPING_MODIFIERES.get(this.toppingType);
        return  calories;
    }
}
