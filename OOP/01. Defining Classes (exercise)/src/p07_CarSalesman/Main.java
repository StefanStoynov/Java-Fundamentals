package p07_CarSalesman;

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
        Map<String, Engine> engines = new LinkedHashMap<>();
        List<Car> cars = new LinkedList<>();
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            //“<Model> <Power> <Displacement> <Efficiency>
            String[] line = reader.readLine().split("\\s+");
            String model = line[0];
            int power = Integer.parseInt(line[1]);
            switch (line.length) {
                case 2:
                    Engine engine = new Engine(model, power);
                    engines.putIfAbsent(model, engine);

                    break;
                case 3:
                    try {
                        int displacement = Integer.parseInt(line[2]);
                        Engine engine1 = new Engine(model, power, displacement);
                        engines.putIfAbsent(model, engine1);

                    } catch (NumberFormatException nfe) {
                        String efficiency = line[2];
                        Engine engine1 = new Engine(model, power, efficiency);
                        engines.putIfAbsent(model, engine1);

                    }
                    break;
                case 4:
                    int displacement = Integer.parseInt(line[2]);
                    String efficiency = line[3];
                    Engine engine2 = new Engine(model, power, displacement, efficiency);
                    engines.putIfAbsent(model, engine2);

                    break;
            }


        }

        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m; i++) {
            //“<Model> <Engine> <Weight> <Color>”,
            String[] line = reader.readLine().split("\\s+");
            String model = line[0];
            String engine = line[1];
            switch (line.length) {
                case 2:
                    Car car = new Car(model, engines.get(engine));
                    cars.add(car);
                    break;
                case 3:
                    try {
                        int weight = Integer.parseInt(line[2]);
                        Car car1 = new Car(model, engines.get(engine), weight);
                        cars.add(car1);

                    } catch (NumberFormatException nfe) {
                        String color = line[2];
                        Car car1 = new Car(model, engines.get(engine), color);
                        cars.add(car1);
                    }
                    break;
                case 4:
                    int weight = Integer.parseInt(line[2]);
                    String color = line[3];
                    Car car2 = new Car(model, engines.get(engine), weight, color);
                    cars.add(car2);
                    break;
            }
        }
        cars.forEach(System.out::print);
    }
}
