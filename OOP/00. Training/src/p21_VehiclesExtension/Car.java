package p21_VehiclesExtension;

public class Car extends Vechicle {


    public Car(double fuelQuantity, double fuelConsumtion, double tankCapacity) {
        super(fuelQuantity, fuelConsumtion+0.9, tankCapacity);
    }
}
