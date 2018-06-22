package p01_Vehicles;

public class Truck extends Vehicle {
    private double fuelQuantity;
    private double fuelConsuption;

    public Truck(double fuelQuantity, double fuelConsuption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsuption = fuelConsuption;
    }

    @Override
    public double Driving(double distance) {
        this.fuelQuantity -= (this.fuelConsuption + 1.6) * distance;
        return this.fuelQuantity;
    }

    @Override
    public double Refuling(double litters) {
        this.fuelQuantity+=litters;
        return fuelQuantity;
    }
}
