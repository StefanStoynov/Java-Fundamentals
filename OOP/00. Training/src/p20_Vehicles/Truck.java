package p20_Vehicles;

public class Truck extends Vechicle {

    public Truck(double fuelQuantity, double fuelConsumtion) {
        super(fuelQuantity, fuelConsumtion + 1.6);
    }

    @Override
    public void Refuel(double liters) {
        super.Refuel(liters * 0.95);
    }
}
