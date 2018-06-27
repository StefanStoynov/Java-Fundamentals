package p17_PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double totalGrams = 0;

        String[] pizzaTokens = reader.readLine().split("\\s+");
        String pizzaName = pizzaTokens[1];
        int numberOfSouce = Integer.parseInt(pizzaTokens[2]);
        try {
            Pizza pizza = new Pizza(pizzaName, numberOfSouce);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            return;
        }
        String[] doughTokens = reader.readLine().split("\\s+");
        String flourType = doughTokens[1];
        String bakingTehnique = doughTokens[2];
        double weight = Double.parseDouble(doughTokens[3]);
        try {
            Dough dough = new Dough(flourType, bakingTehnique, weight);
            totalGrams += dough.getDoughCalories();
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            return;
        }
        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] toppingTokens = line.split("\\s+");

            String toppingType = toppingTokens[1];
            double weightTopping = Double.parseDouble(toppingTokens[2]);
            try {
                Topping topping = new Topping(toppingType, weightTopping);
                totalGrams += topping.toppingCalorie();
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                return;
            }
        }

        System.out.println(String.format("%s - %.2f",pizzaName,totalGrams));

    }
}
