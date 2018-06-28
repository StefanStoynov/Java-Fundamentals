package p20_Vehicles;

public class Car extends Vechicle {


    public Car(double fuelQuantity, double fuelConsumtion) {
        super(fuelQuantity, fuelConsumtion + 0.9);
    }
}
