package p21_CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CoffeeMachine cf = new CoffeeMachine();
        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");

            if (tokens.length == 1 && !"END".equals(tokens[0])) {
                cf.insertCoin(tokens[0]);
            } else {
                cf.buyCoffee(tokens[0],tokens[1]);
            }
        }
        for (Coffee coffee : cf.coffeesSold) {
            System.out.println(coffee);
        }
    }
}
