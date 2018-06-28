package p21_VehiclesExtension;

public class Truck extends Vechicle {

    public Truck(double fuelQuantity, double fuelConsumtion, double tankCapacity) {
        super(fuelQuantity, fuelConsumtion + 1.6, tankCapacity);
    }

    @Override
    public void Refuel(double liters) {
        super.Refuel(liters * 0.95);
    }
}
