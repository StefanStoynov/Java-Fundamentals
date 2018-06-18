package p05_PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Toppings> toppings;

    public Pizza(String name, int countOfToppings) {
        this.setName(name);
        this.setToppings(countOfToppings);

    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int countOfToppings) {
        if (countOfToppings < 0 || countOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>();
    }

    private double calculateCalories() {
        double doughCalories = this.dough.calculateCalories();
        double toppingCallories = this.toppings.stream().mapToDouble(Toppings::calculateCalories).sum();
        return doughCalories + toppingCallories;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void addTopping(Toppings toppings) {
        this.toppings.add(toppings);
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", this.name, calculateCalories());
    }

}
