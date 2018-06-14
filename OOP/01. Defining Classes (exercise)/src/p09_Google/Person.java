package p09_Google;

import java.util.List;

public class Person {
    private String personName;
    private Company company;
    private Car car;

    private List<Parents>parents;
    private List<Chilren>chilren;
    private List<Pokemon>pokemons;

    public Person(String personName) {
        this.personName = personName;
    }

    public Person(String personName, Company company) {
        this.personName = personName;
        this.company = company;
    }

    public Person(String personName, Company company, Car car) {
        this.personName = personName;
        this.company = company;
        this.car = car;
    }

    public Person(String personName, Company company, Car car, List<Parents> parents) {
        this.personName = personName;
        this.company = company;
        this.car = car;
        this.parents = parents;
    }

    public Person(String personName, Company company, Car car, List<Parents> parents, List<Chilren> chilren) {
        this.personName = personName;
        this.company = company;
        this.car = car;
        this.parents = parents;
        this.chilren = chilren;
    }

    public Person(String personName, Company company, Car car, List<Parents> parents, List<Chilren> chilren, List<Pokemon> pokemons) {
        this.personName = personName;
        this.company = company;
        this.car = car;
        this.parents = parents;
        this.chilren = chilren;
        this.pokemons = pokemons;
    }
}
