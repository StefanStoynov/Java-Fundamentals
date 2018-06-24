package p07_RawData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfCars = Integer.parseInt(reader.readLine());
        List<Car> cars = new LinkedList<>();

        while (numberOfCars-- > 0) {

            String[] carTokens = reader.readLine().split("\\s+");
            String model = carTokens[0];
            int engineSpeed = Integer.parseInt(carTokens[1]);
            int enginePower = Integer.parseInt(carTokens[2]);
            int cargoWeight = Integer.parseInt(carTokens[3]);
            String cargpType = carTokens[4];
            double tire1Presure = Double.parseDouble(carTokens[5]);
            int tire1Age = Integer.parseInt(carTokens[6]);
            double tire2Presure = Double.parseDouble(carTokens[7]);
            int tire2Age = Integer.parseInt(carTokens[8]);
            double tire3Presure = Double.parseDouble(carTokens[9]);
            int tire3Age = Integer.parseInt(carTokens[10]);
            double tire4Presure = Double.parseDouble(carTokens[11]);
            int tire4Age = Integer.parseInt(carTokens[12]);
            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargpType);
            Tires tires = new Tires(tire1Presure, tire1Age, tire2Presure, tire2Age, tire3Presure, tire3Age, tire4Presure, tire4Age);
            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);

        }

        String command = reader.readLine();
        switch (command) {
            case "fragile":

                cars.stream().filter(car -> car.getCargo().getCargoType().equals("fragile")
                        && car.getTires().getTire1Presure() < 1
                        || car.getTires().getTire2Presure() < 1
                        || car.getTires().getTire3Presure() < 1
                        || car.getTires().getTire4Presure() < 1).forEach(c -> System.out.println(c.getModel()));
                break;
            case "flamable":

                cars.stream().filter(c -> c.getCargo().getCargoType().equals("flamable") &&
                        c.getEngine().getEnginePower() > 250)
                        .forEach(c-> System.out.println(c.getModel()));
                break;
        }
    }
}
