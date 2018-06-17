package p04_ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new HashMap<>();

        for (int i = 0; i < 1; i++) {
            String[] nameAndMoney = reader.readLine().split(";");
            for (int j = 0; j < nameAndMoney.length; j++) {
                String[] currentPerson = nameAndMoney[j].split("=");
                String name = currentPerson[0];
                int money = Integer.parseInt(currentPerson[1]);
                try {
                    Person person = new Person(name, money);
                    people.putIfAbsent(name, person);
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                    return;
                }
            }
            String[] grocery = reader.readLine().split(";");
            for (int j = 0; j < grocery.length; j++) {
                String[] currentProduct = grocery[j].split("=");
                String productName = currentProduct[0];
                int productPrice = Integer.parseInt(currentProduct[1]);

                try {
                    Product product = new Product(productName, productPrice);
                    products.putIfAbsent(productName, product);
                } catch (IllegalArgumentException iae) {
                    System.out.println(iae.getMessage());
                    return;
                }

            }
        }
        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");

            String pursonName = tokens[0];
            String product = tokens[1];

            if (canAffordProduct(people.get(pursonName).getMoney(), products.get(product).getPrice())) {
                int money = people.get(pursonName).getMoney();
                int price = products.get(product).getPrice();
                int newMoney = money - price;
                people.get(pursonName).setMoney(newMoney);
                Product product1 = new Product(product);
                people.get(pursonName).addProduct(product1);
                System.out.println(String.format("%s bought %s", pursonName, product));
            } else {
                System.out.println(String.format("%s can't afford %s", pursonName, product));
            }
        }
        for (Person person : people.values()) {
            System.out.println(person.toString());
        }


    }

    public static boolean canAffordProduct(int personMoney, int productPrice) {
        if (personMoney >= productPrice) {
            return true;
        }
        return false;
    }
}

