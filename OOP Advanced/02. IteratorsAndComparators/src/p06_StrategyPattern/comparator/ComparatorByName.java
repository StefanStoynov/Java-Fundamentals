package p06_StrategyPattern.comparator;

import p06_StrategyPattern.Person;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int nameLength =  o1.getName().length() - o2.getName().length();
        if (nameLength!=0){
            return nameLength;
        }

        char first = o1.getName().toLowerCase().charAt(0);
        char second = o2.getName().toLowerCase().charAt(0);

        return String.valueOf(o1.getName().charAt(0)).compareToIgnoreCase(String.valueOf(o2.getName().charAt(0)));

    }
}
