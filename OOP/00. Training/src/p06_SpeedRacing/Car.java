package p06_SpeedRacing;

public class Car {

    private String model;
    private double fuelAmount;
    private double fuelConsumtion;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelConsumtion) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelConsumtion = fuelConsumtion;
    }


    public void Drive(double km) {
        double neededFuel = this.fuelConsumtion * km;
        if (neededFuel <= this.fuelAmount) {
            this.distanceTraveled += km;
            this.fuelAmount -= neededFuel;
        } else {
            throw new IllegalArgumentException("Insufficient fuel for the drive");

        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTraveled);
    }
}
