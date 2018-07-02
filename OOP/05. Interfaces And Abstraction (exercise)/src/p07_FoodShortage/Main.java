package p07_FoodShortage;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfPersonToRead = Integer.parseInt(reader.readLine());
        List<Buyer> people = new LinkedList<>();
        while (numberOfPersonToRead-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            if (tokens.length == 4) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];
                String birthday = tokens[3];
                Buyer citizen = new Citizen(name, age, id, birthday);
                people.add(citizen);
            } else {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String groop = tokens[2];
                Buyer rebel = new Rebel(name, age, groop);
                people.add(rebel);
            }
        }

        String line;
        while (true) {
            if ("End".equals(line = reader.readLine())) {
                break;
            }

            String nameBuingFood = line;


            for (Buyer person : people) {
                if(person.getName().equals(nameBuingFood)){
                    person.byFood();
                }
            }


        }
        int ttlFood = people.stream().mapToInt(Buyer::getFood).sum();

        System.out.println(ttlFood);


    }
}
