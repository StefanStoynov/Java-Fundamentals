package p07_FoodShortage;

public class Rebel implements Buyer {
    private String name;
    private int age;
    private String groop;
    private int food;

    public Rebel(String name, int age, String groop) {
        this.name = name;
        this.age = age;
        this.groop = groop;
    }




    @Override
    public void byFood() {
        this.food += 5;
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
