package p16_ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();
        String[] personTokens = reader.readLine().split(";");
        String[] productTokens = reader.readLine().split(";");

        for (int i = 0; i < personTokens.length; i++) {
            String[] pTokens = personTokens[i].split("=");
            try {
                Person person = new Person(pTokens[0], Integer.parseInt(pTokens[1]));
                people.putIfAbsent(pTokens[0], person);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                return;
            }
        }
        for (int i = 0; i < productTokens.length; i++) {
            String[] prodTokens = productTokens[i].split("=");
            try {
                Product product = new Product(prodTokens[0], Integer.parseInt(prodTokens[1]));
                products.putIfAbsent(prodTokens[0], product);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                return;
            }
        }

        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");
            String name = tokens[0];
            String product = tokens[1];

            if (people.get(name).getMoney() >= products.get(product).getCost()) {
                people.get(name).addProduct(products.get(product));
                int money = people.get(name).getMoney();
                int price = products.get(product).getCost();
                int restMoney = money - price;
                people.get(name).setMoney(restMoney);
                System.out.println(String.format("%s bought %s", name, product));

            } else {
                System.out.println(String.format("%s can't afford %s", name, product));
            }
        }

        for (Map.Entry<String, Person> personEntry : people.entrySet()) {
            System.out.println(personEntry.getValue().toString());
        }


    }
}
