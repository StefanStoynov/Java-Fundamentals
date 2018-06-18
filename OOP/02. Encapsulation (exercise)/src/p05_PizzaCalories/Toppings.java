package p05_PizzaCalories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Toppings {
    private static final List<String> TOPPING_TYPES = new ArrayList<>() {{
        add("Meat");
        add("Veggies");
        add("Cheese");
        add("Sauce");
    }};
    private static final Map<String, Double> TOPPING_MODIFIRE = new HashMap<>() {{
        put("Meat", 1.2);
        put("Veggies", 0.8);
        put("Cheese", 1.1);
        put("Sauce", 0.9);

    }};

    private String toppingType;
    private double weight;

    public Toppings(String toppingType, double weight) {

        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (!TOPPING_TYPES.contains(toppingType)) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.",toppingType));
        }
        this.toppingType = toppingType;
    }

    public void setWeight(double weight) {
        if (weight < 1 || weight > 50){
            throw new IndexOutOfBoundsException(String.format("%s weight should be in the range [1..50].",this.toppingType));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return PizzaConstants.DEFAULT_CALORIES
                * this.weight
                * TOPPING_MODIFIRE.get(this.toppingType);

    }
}
