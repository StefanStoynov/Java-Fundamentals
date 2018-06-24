package p06_SpeedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfCars = Integer.parseInt(reader.readLine());
        Map<String,Car> cars = new LinkedHashMap<>();

        while (numberOfCars-- > 0) {

            String[] carTokens = reader.readLine().split("\\s+");
            String model = carTokens[0];
            double fuel = Double.parseDouble(carTokens[1]);
            double fuelConsumtion = Double.parseDouble(carTokens[2]);
            Car car = new Car(model,fuel,fuelConsumtion);
            cars.put(model,car);
        }
        String line;
        while (true) {
            if ("End".equals(line = reader.readLine())) {
                break;
            }
            String[] carTokens = line.split("\\s+");

            String model = carTokens[1];
            int amountOfKm = Integer.parseInt(carTokens[2]);
            Car car = cars.get(model);
            try {
                car.Drive(amountOfKm);
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }

            
        }
        cars.values().forEach(System.out::println);
    }
}
