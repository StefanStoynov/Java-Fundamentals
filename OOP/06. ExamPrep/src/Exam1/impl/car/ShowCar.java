package Exam1.impl.car;

import Exam1.Abstract.Car;

public class ShowCar extends Car {
    private int stars;

    public ShowCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.stars = 0;
    }

    @Override
    public void tuneCar(Object... params) {
        int starsincrease = (int) (params[0]);
        this.stars += starsincrease;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(this.stars).append(" ").append("*");
        return sb.toString();
    }
}
