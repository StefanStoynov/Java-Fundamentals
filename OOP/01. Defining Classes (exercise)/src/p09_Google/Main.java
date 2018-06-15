package p09_Google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Person> people = new HashMap<>();
        String line;
        while (true) {
            if ("End".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");
            String personName = tokens[0];
            people.putIfAbsent(personName, new Person(personName));
            Person person = people.get(personName);
            switch (tokens[1]) {
                case "company":
                    //company <companyName> <department> <salary.2f>
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    Company company = new Company(companyName, department, salary);
                    person.setCompany(company);
                    break;
                case "pokemon":
                    //pokemon <pokemonName> <pokemonType>
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];
                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    person.addPokemon(pokemon);
                    break;
                case "parents":
                    //parents <parentName> <parentBirthday>
                    String parentName = tokens[2];
                    String parentBirthday = tokens[3];
                    Parent parent = new Parent(parentName, parentBirthday);
                    person.addParent(parent);
                    break;
                case "children":
                    //children <childName> <childBirthday>
                    String childName = tokens[2];
                    String childBirthday= tokens[3];
                    Child child = new Child(childName,childBirthday);
                    person.addChild(child);
                    break;
                case "car":
                    //car <carModel> <carSpeed>
                    String carModel =tokens[2];
                    String carSpeed = tokens[3];
                    Car car = new Car(carModel,carSpeed);
                    person.setCar(car);
                    break;
            }


        }
        String informationAbout = reader.readLine();

        Person person = people.get(informationAbout);
        System.out.println(person.toString());
    }
}
