package p10_SalaryIncrease;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> people = new LinkedList<>();

        int numberOfPeople = Integer.parseInt(reader.readLine());

        while (numberOfPeople-- > 0) {

            String[] perosnTokens = reader.readLine().split("\\s+");
            String firstName = perosnTokens[0];
            String lastName = perosnTokens[1];
            int age = Integer.parseInt(perosnTokens[2]);
            double salary = Double.parseDouble(perosnTokens[3]);
            Person person = new Person(firstName, lastName, age, salary);
            people.add(person);
        }
        double bonus = Double.parseDouble(reader.readLine());

        for (Person person : people) {
            person.salaryWithBonus(bonus);
            System.out.println(person.toString());
        }
    }
}
