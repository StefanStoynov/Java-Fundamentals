package Exam3;


public class WaterBender extends Benders {
    private double waterClarity;

    public WaterBender(String name, int power, double waterClarity) {
        super(name, power);
        this.waterClarity = waterClarity;
    }

    @Override
    protected double GetPower() {
        return super.getPower() * this.waterClarity;
    }

    @Override
    public String toString() {
        return String.format("Water Bender: %s, Power: %d, Water Clarity: %.2f",super.getName(),super.getPower(),this.waterClarity);
    }
}
