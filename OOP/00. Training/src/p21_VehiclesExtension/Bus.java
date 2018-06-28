package p21_VehiclesExtension;

public class Bus extends Vechicle {

    public Bus(double fuelQuantity, double fuelConsumtion, double tankCapacity) {
        super(fuelQuantity, fuelConsumtion, tankCapacity);
    }

    public boolean driveEmpty(double km){
        return super.Drive(km);
    }

    @Override
    public boolean Drive(double km) {
        double neededFuel =km* (super.getFuelConsumtion()+1.4);
        if (neededFuel>super.getFuelQuantity()){
            return false;
        }
        super.setFuelQuantity(super.getFuelQuantity()-neededFuel);
        return true;
    }
}
