package p03_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Person> people = new TreeMap<>();
        int number = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= number; i++) {
            String[]input = reader.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person();
            person.setName(name);
            person.setAge(age);
            people.putIfAbsent(i,person);
        }
        people
                .entrySet()
                .stream()
                .sorted((x1,x2)-> x1.getValue().getName().compareTo(x2.getValue().getName()))
                .filter(x-> x.getValue().getAge()>30)
                .forEach(s-> System.out.println(String.format("%s - %d",s.getValue().getName(),s.getValue().getAge())));
    }
}
