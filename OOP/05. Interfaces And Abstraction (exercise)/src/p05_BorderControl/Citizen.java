package p05_BorderControl;

public class Citizen implements Controlable {

    private String name;
    private String id;
    private int age;

    public Citizen(String name, int age, String id) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
