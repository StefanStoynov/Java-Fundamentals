package p05_ComparingObjects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person otherPerson) {
        int comaparatorName = this.name.compareTo(otherPerson.name);
        if (comaparatorName!=0){
            return comaparatorName;
        }
        int ageComaprator = this.age- otherPerson.age;
        if (ageComaprator!=0){
            return ageComaprator;
        }
        return this.town.compareTo(otherPerson.town);

    }
}
