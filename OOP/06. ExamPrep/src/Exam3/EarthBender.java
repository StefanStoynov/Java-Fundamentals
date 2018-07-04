package Exam3;



public class EarthBender extends Benders {
    private double groundSaturation;

    public EarthBender(String name, int power, double groundSaturation) {
        super(name, power);
        this.groundSaturation = groundSaturation;
    }

    @Override
    protected double GetPower() {
        return super.getPower() * this.groundSaturation;
    }

    @Override
    public String toString() {
        return String.format("Earth Bender: %s, Power: %d, Ground Saturation: %.2f",super.getName(),super.getPower(),this.groundSaturation);
    }
}
