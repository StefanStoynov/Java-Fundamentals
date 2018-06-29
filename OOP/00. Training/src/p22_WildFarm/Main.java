package p22_WildFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Animal> animals = new LinkedList<>();
        String line;
        while (true) {
            if ("End".equals(line = reader.readLine())) {
                break;
            }
            String[] animalTokens = line.split("\\s+");

            String animalType = animalTokens[0];
            String animalName = animalTokens[1];
            double animalWeight = Double.parseDouble(animalTokens[2]);
            String animalLivingRegion = animalTokens[3];
            int foodEaten = 0;

            String[] foodTokens = reader.readLine().split("\\s+");

            String foodType = foodTokens[0];
            int foodQuantity = Integer.parseInt(foodTokens[1]);




            switch (animalType) {
                case "Cat":
                    String breed = animalTokens[4];
                    Animal cat = new Cat(animalType, animalName, animalWeight, foodEaten, animalLivingRegion,breed);
                    animals.add(cat);
                    cat.makeSound();
                    cat.eatFood(foodQuantity);
                    break;
                case "Tiger":
                    Animal tiger = new Tiger(animalType, animalName, animalWeight, foodEaten, animalLivingRegion);
                    animals.add(tiger);
                    tiger.makeSound();
                    if (foodType.equals("Meat")){
                        tiger.eatFood(foodQuantity);
                    }else{
                        System.out.println("Tigers are not eating that type of food!");
                    }
                    break;
                case "Zebra":
                    Animal zebra = new Zebra(animalType, animalName, animalWeight, foodEaten, animalLivingRegion);
                    animals.add(zebra);
                    zebra.makeSound();
                    if (foodType.equals("Vegetable")){
                        zebra.eatFood(foodQuantity);
                    }else{
                        System.out.println("Zebras are not eating that type of food!");
                    }

                    break;
                case "Mouse":
                    Animal mouse = new Mouse(animalType, animalName, animalWeight, foodEaten, animalLivingRegion);
                    animals.add(mouse);
                    mouse.makeSound();
                    if (foodType.equals("Vegetable")){
                        mouse.eatFood(foodQuantity);
                    }else{
                        System.out.println("Mice are not eating that type of food!");
                    }
                    break;
            }
            for (Animal animal : animals) {
                System.out.println(animal.toString());
            }
        }
    }
}
