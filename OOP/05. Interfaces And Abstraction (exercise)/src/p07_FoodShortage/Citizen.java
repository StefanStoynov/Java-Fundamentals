package p07_FoodShortage;


public class Citizen implements Buyer {
    private String name;
    private int age;
    private String id;
    private String birthday;
    private int food;

    public Citizen(String name, int age, String id, String birthday) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthday = birthday;
    }



    @Override
    public void byFood() {
        this.food +=10;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
