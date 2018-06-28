package p21_VehiclesExtension;

public abstract class Vechicle {
    private double fuelQuantity;
    private double fuelConsumtion;
    private double tankCapacity;

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public double getFuelConsumtion() {
        return this.fuelConsumtion;
    }

    public double getTankCapacity() {
        return this.tankCapacity;
    }

    public Vechicle(double fuelQuantity, double fuelConsumtion, double tankCapacity) {
        this.setFuelQuantity(fuelQuantity);
        this.fuelConsumtion = fuelConsumtion;
        this.setTankCapacity(tankCapacity);
    }

    public void setTankCapacity(double tankCapacity) {
        if (tankCapacity < 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.tankCapacity = tankCapacity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        this.fuelQuantity = fuelQuantity;
    }


    public boolean Drive(double km) {
        if (this.fuelConsumtion * km <= this.fuelQuantity) {
            this.fuelQuantity -= fuelConsumtion * km;
            return true;
        }
        return false;
    }

    public void Refuel(double liters) {
        if (liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        } else if (liters < this.tankCapacity) {
            this.fuelQuantity += liters;
        } else {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }

    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), fuelQuantity);
    }
}
