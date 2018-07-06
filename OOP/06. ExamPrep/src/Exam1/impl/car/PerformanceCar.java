package Exam1.impl.car;

import Exam1.Abstract.Car;

import java.util.ArrayList;
import java.util.List;

public class PerformanceCar extends Car {
    private List<String> addOns;

    public PerformanceCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.addOns = new ArrayList<>();
    }

    @Override
    public void setHorsepower(int horsepower) {
        super.setHorsepower(horsepower + (horsepower * 50 / 100));
    }

    @Override
    public void setSuspension(int suspension) {
        super.setSuspension(suspension - (suspension * 25 / 100));
    }

    @Override
    public void tuneCar(Object... params) {
        String addOn = (String)params[0];
        this.addOns.add(addOn);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (addOns.size() == 0) {
            sb.append("Add-ons: ").append("None");
        } else {
           sb.append("Add-ons: ").append(String.join(", ", addOns));
        }
        return sb.toString();
    }
}
