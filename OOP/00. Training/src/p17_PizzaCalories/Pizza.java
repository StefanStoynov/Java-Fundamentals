package p17_PizzaCalories;

import java.util.LinkedList;
import java.util.List;

public class Pizza {
    private String name;
    private int toppingNumber;
    private List<Dough> doughs;
    private List<Topping> toppings;


    protected Pizza(String name, int toppingNumber) {
        this.setName(name);
        this.setToppingNumber(toppingNumber);
        this.doughs = new LinkedList<>();
        this.toppings = new LinkedList<>();

    }

    private void setName(String name) {
        name = name.trim();
        if (name.length() == 0 || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppingNumber(int toppingNumber) {
        if (toppingNumber < 0 || toppingNumber > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppingNumber = toppingNumber;
    }

    public void addDough(Dough dough) {
        this.doughs.add(dough);
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }


}
