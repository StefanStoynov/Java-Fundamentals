package p01_Vehicles;

public class Car extends Vehicle {
    private double fuelQuantity;
    private double fuelConsuption;

    public Car(double fuelQuantity, double fuelConsuption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsuption = fuelConsuption;
    }

    @Override
    public double Driving(double distance) {
        this.fuelQuantity -= (this.fuelConsuption + 0.9) * distance;
        return this.fuelQuantity;
    }

    @Override
    public double Refuling(double litters) {
        this.fuelQuantity += litters;
        return fuelQuantity;
    }
}
