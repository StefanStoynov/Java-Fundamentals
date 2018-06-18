package p05_PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] pizzaTokens = reader.readLine().split("\\s+");

            String pizzaName = pizzaTokens[1];
            int toppingCount = Integer.parseInt(pizzaTokens[2]);

            Pizza pizza = new Pizza(pizzaName, toppingCount);

            String[] doughTokens = reader.readLine().split("\\s+");

            String flourtype = doughTokens[1];
            String bakingTehnique = doughTokens[2];
            double weight = Double.parseDouble(doughTokens[3]);

            Dough dough = new Dough(flourtype, bakingTehnique, weight);
            pizza.setDough(dough);

            while (toppingCount-- > 0) {

                String[] toppingTokens = reader.readLine().split("\\s+");

                String toppingType = toppingTokens[1];
                double weight1 = Double.parseDouble(toppingTokens[2]);

                Toppings toppings = new Toppings(toppingType, weight1);

                pizza.addTopping(toppings);

            }
            System.out.println(pizza.toString());


        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
