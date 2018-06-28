package p20_Vehicles;

public abstract class Vechicle {
    private double fuelQuantity;
    private double fuelConsumtion;

    public Vechicle(double fuelQuantity, double fuelConsumtion) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumtion = fuelConsumtion;
    }

    public boolean Drive(double km) {
        if (this.fuelConsumtion * km <= this.fuelQuantity) {
            this.fuelQuantity -= fuelConsumtion * km;
            return true;
        }
        return false;
    }

    public void Refuel(double liters) {
        if (liters > 0) {
            this.fuelQuantity += liters;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",getClass().getSimpleName(),fuelQuantity);
    }
}
