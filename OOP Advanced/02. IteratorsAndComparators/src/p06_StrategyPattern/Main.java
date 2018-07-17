package p06_StrategyPattern;

import p06_StrategyPattern.comparator.ComparatorByAge;
import p06_StrategyPattern.comparator.ComparatorByName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int peopleNumber = Integer.parseInt(reader.readLine());
        Set<Person>setByName = new TreeSet<>(new ComparatorByName());
        Set<Person>setByAge = new TreeSet<>(new ComparatorByAge());

        for (int i = 0; i <peopleNumber ; i++) {
           String [] personTokens = reader.readLine().split("\\s+");
           Person person = new Person(personTokens[0],Integer.parseInt(personTokens[1]));
           setByName.add(person);
           setByAge.add(person);
        }

        setByName.forEach(System.out::println);
        setByAge.forEach(System.out::println);
    }
}
