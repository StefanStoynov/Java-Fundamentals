package Exam3;

public abstract class Benders {
    private String name;
    private int power;

    public Benders(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public String getName() {
        return this.name;
    }

    protected abstract double GetPower();


}
