package p06_BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Mammal>mammals = new ArrayList<>();
        String line;
        while (true) {
            if ("End".equals(line = reader.readLine())) {
                break;
            }

            String[] tokens  = line.split("\\s+");

            if (tokens.length==5){
               Mammal citizen = new Citizen(tokens[1],Integer.parseInt(tokens[2]),tokens[3],tokens[4]);
               mammals.add(citizen);
            }else if (tokens.length == 3 && !tokens[0].equals("Robot")) {
                Mammal pet = new Pet(tokens[1], tokens[2]);
                mammals.add(pet);
            }

        }
        String year = reader.readLine();

        for (Mammal mammal : mammals) {
            if (mammal.getBirthday().endsWith(year)){
                System.out.println(mammal.getBirthday());
            }
        }
    }
}
