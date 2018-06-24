package p04_OpinionPoll;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new LinkedList<>();
        int personCount = Integer.parseInt(reader.readLine());

        while (personCount-->0){
            String[]personTokens = reader.readLine().split("\\s+");
            String name = personTokens[0];
            int age = Integer.parseInt(personTokens[1]);

            Person person = new Person(name,age);
            people.add(person);
        }
        people.stream().filter(p-> p.getAge()>30).sorted((p1,p2)->p1.getName().compareTo(p2.getName())).forEach(p-> System.out.println(p.toString()));
    }
}
