package Exam1;

import Exam1.Abstract.Car;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car>parkedCars;

    public Garage() {
        this.parkedCars = new ArrayList<>();
    }

    public boolean isParked(Car car){
        return this.parkedCars.contains(car);
    }
    public void addCar(Car car){
        this.parkedCars.add(car);
    }

    public void removeCar(Car car) {
        this.parkedCars.remove(car);
    }

    public List<Car> getParkedCars() {
        return this.parkedCars;
    }
}
