package p09_Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new LinkedList<>();
        String line;
        while (true) {
            if ("End".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");
            String personName = tokens[0];
            Person person = new Person(personName);
            people.add(person);

            switch (tokens[1]) {
                Car car = new Car();
                Chilren chilren = new Chilren();
                Company company = new Company();
                Parents parents = new Parents();
                Pokemon pokemon = new Pokemon();
                Person person1 = new Person(personName,company,car,new<Parents>parents,new<Chilren>chilren,new <Pokemon>pokemon);
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[2];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    break;
                case "company":
                    break;
                case "parents":
                    break;
                case "children":
                    break;
                case "car":
                    break;


            }


        }
        String informationOfNameToPrint = reader.readLine();
    }
}
