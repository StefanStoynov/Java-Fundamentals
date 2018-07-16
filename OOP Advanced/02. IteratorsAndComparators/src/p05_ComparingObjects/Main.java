package p05_ComparingObjects;

import java.awt.event.PaintEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();
        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] personTokens = line.split("\\s+");

            Person person = new Person(personTokens[0], Integer.parseInt(personTokens[1]), personTokens[2]);

            people.add(person);
        }

        int number = Integer.parseInt(reader.readLine());
        int equalPeople = 0;
        int diferentPeople = 0;
        for (Person person : people) {
            if (person.compareTo(people.get(number-1)) == 0) {
                equalPeople++;
            }else{
                diferentPeople++;
            }
        }
        if (equalPeople==1){
            System.out.println("No matches");
        }else{
            System.out.println(String.format("%d %d %d",equalPeople,diferentPeople,people.size()));
        }

    }
}
