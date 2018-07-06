package Exam1;

import Exam1.Abstract.Car;
import Exam1.Abstract.Race;
import Exam1.impl.car.PerformanceCar;
import Exam1.impl.car.ShowCar;
import Exam1.impl.race.CasualRace;
import Exam1.impl.race.DragRace;
import Exam1.impl.race.DriftRace;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CarManager {
    private Map<Integer, Car> cars;
    private Map<Integer, Race> races;
    private Garage garage;

    public CarManager() {
        cars = new LinkedHashMap<>();
        races = new LinkedHashMap<>();
        this.garage = new Garage();
    }


    public void addCar(int id, Car car) {
        this.cars.put(id, car);
    }

    public void register(int id, String type, String brand, String model,
                         int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        Car car = null;
        switch (type) {
            case "Performance":
                car = new PerformanceCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                break;
            case "Show":
                car = new ShowCar(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
                break;
        }
        if (car != null) {
            this.addCar(id, car);
        }
    }

    public String check(int id) {
        return cars.get(id).toString();
    }

    public void open(int id, String type, int length, String route, int prizePool) {

        Race race = null;
        switch (type) {
            case "Casual":
                race = new CasualRace(length, route, prizePool);
                break;
            case "Drag":
                race = new DragRace(length, route, prizePool);
                break;
            case "Drift":
                race = new DriftRace(length, route, prizePool);
                break;
        }
        races.put(id, race);
    }

    public void participate(int carId, int raceId) {
        Car car = this.cars.get(carId);
        if (garage.isParked(car)) {
            return;
        }
        Race race = races.get(raceId);
        race.addParticipants(cars.get(carId));
    }

    public String start(int id) {
        Race race = this.races.get(id);

        if (!race.hasParticipants()) {
            return "Cannot start the race with zero participants.";
        }

        String raceResult = race.toString();
        this.races.remove(id);
        return raceResult;

    }

    public void park(int id) {
        Car car = cars.get(id);
        if (races.values().stream().anyMatch(race -> race.isParticipant(car))) {
            return;
        }
        garage.addCar(car);
    }

    public void unpark(int id) {
        Car car = cars.get(id);

        garage.removeCar(car);
    }

    public void tune(int tuneIndex, String addOn) {
        garage.getParkedCars().forEach(car -> {
            car.increaseHorcepower(tuneIndex);
            car.ingreaseSusspantion(tuneIndex / 2);
            if (car.getClass().getSimpleName().equals("PerformanceCar")) {
                car.tuneCar(addOn);
            } else {
                car.tuneCar(tuneIndex);
            }
        });
    }

}
