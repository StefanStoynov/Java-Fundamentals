package p06_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfCars = Integer.parseInt(reader.readLine());
        List<Car> cars = new LinkedList<>();
        for (int i = 0; i < numberOfCars; i++) {
            //“<Model> <EngineSpeed> <EnginePower> <CargoWeight> <CargoType>
            // <Tire1Pressure> <Tire1Age> <Tire2Pressure> <Tire2Age> <Tire3Pressure> <Tire3Age> <Tire4Pressure> <Tire4Age>
            String[] currentCar = reader.readLine().split("\\s+");
            String model = currentCar[0];
            int engineSpeed = Integer.parseInt(currentCar[1]);
            int enginePower = Integer.parseInt(currentCar[2]);
            int cargoWeight = Integer.parseInt(currentCar[3]);
            String cargoType = currentCar[4];
            double tire1Presure = Double.parseDouble(currentCar[5]);
            int tire1Age = Integer.parseInt(currentCar[6]);
            double tire2Presure = Double.parseDouble(currentCar[7]);
            int tire2Age = Integer.parseInt(currentCar[8]);
            double tire3Presure = Double.parseDouble(currentCar[9]);
            int tire3Age = Integer.parseInt(currentCar[10]);
            double tire4Presure = Double.parseDouble(currentCar[11]);
            int tire4Age = Integer.parseInt(currentCar[12]);
            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire tire = new Tire(tire1Presure, tire1Age, tire2Presure, tire2Age, tire3Presure, tire3Age, tire4Presure, tire4Age);
            Car car = new Car(model, engine, cargo, tire);
            cars.add(car);
        }
        String command = reader.readLine();

        if ("fragile".equals(command)) {
            cars.stream().filter(c -> c.getCargo().getCargoType().equals("fragile")
                    && c.getTire().getTire1Presure() < 1
                    || c.getTire().getTire2Presure() < 1
                    || c.getTire().getTire3Presure() < 1
                    || c.getTire().getTire4Presure() < 1).forEach(c -> System.out.println(c.getModel()));
        } else {
            cars.stream().filter(c -> c.getCargo().getCargoType().equals("flamable")
                    && c.getEngine().getEnginePower() > 250)
                    .forEach(c -> System.out.println(c.getModel()));
        }
    }
}
