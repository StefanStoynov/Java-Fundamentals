package p09_Google;

import java.util.LinkedList;
import java.util.List;

public class Person {
    private String name;
    private Car car;
    private Company company;

    private List<Parent> parent;
    private List<Child> child;
    private List<Pokemon> pokemon;

    public Person(String name) {
        this.name = name;

        this.parent = new LinkedList<>();
        this.child = new LinkedList<>();
        this.pokemon = new LinkedList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addParent(Parent parent) {
        this.parent.add(parent);
    }

    public void addChild(Child child) {
        this.child.add(child);
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemon.add(pokemon);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(System.lineSeparator())
                .append("Company:").append(System.lineSeparator());
        if (this.company != null) {
            sb.append(this.company).append(System.lineSeparator());
        }
        sb.append("Car:").append(System.lineSeparator());
        if (this.car != null) {
            sb.append(this.car).append(System.lineSeparator());
        }
        sb.append("Pokemon:").append(System.lineSeparator());
        for (Pokemon pokemon : this.pokemon) {
            sb.append(pokemon).append(System.lineSeparator());
        }

        sb.append("Parents:").append(System.lineSeparator());
        for (Parent parent : this.parent) {
            sb.append(parent).append(System.lineSeparator());
        }
        sb.append("Children:").append(System.lineSeparator());
        for (Child child : this.child) {
            sb.append(child).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
