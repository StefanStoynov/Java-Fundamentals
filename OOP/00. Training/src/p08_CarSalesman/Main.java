package p08_CarSalesman;

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

        List<Car> cars = new LinkedList<>();
        Map<String,Engine> engines = new LinkedHashMap<>();

        int numberOfEngines = Integer.parseInt(reader.readLine());
        while (numberOfEngines-- > 0) {

            String[] enginTokens = reader.readLine().split("\\s+");
            String model = enginTokens[0];
            String power = enginTokens[1];
            if (enginTokens.length == 2) {

                Engine engine = new Engine(model, power);
                engines.put(model,engine);

            } else if (enginTokens.length == 3) {

                if (Character.isDigit(enginTokens[2].charAt(0))) {
                    int displacement = Integer.parseInt(enginTokens[2]);
                    Engine engine = new Engine(model, power, displacement);
                    engines.put(model,engine);
                } else {
                    String efficiency = enginTokens[2];
                    Engine engine = new Engine(model, power, efficiency);
                    engines.put(model,engine);
                }

            } else {

                int displacement = Integer.parseInt(enginTokens[2]);
                String efficiency = enginTokens[3];
                Engine engine = new Engine(model, power, displacement, efficiency);
                engines.put(model,engine);

            }

        }
        int numberOfCars = Integer.parseInt(reader.readLine());
        while (numberOfCars-- > 0) {
            String[] carTokens = reader.readLine().split("\\s+");

            String model = carTokens[0];
            String engine = carTokens[1];
            if (carTokens.length==2){
                Car car = new Car(model,engines.get(engine));
                cars.add(car);
            }else if (carTokens.length==3){
                if (Character.isDigit(carTokens[2].charAt(0))){
                    int weight = Integer.parseInt(carTokens[2]);
                    Car car = new Car(model,engines.get(engine),weight);
                    cars.add(car);
                }else{
                    String color = carTokens[2];
                    Car car = new Car(model,engines.get(engine),color);
                    cars.add(car);
                }
            }else{
                int weight = Integer.parseInt(carTokens[2]);
                String color = carTokens[3];
                Car car = new Car(model,engines.get(engine),weight,color);
                cars.add(car);
            }

        }
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
