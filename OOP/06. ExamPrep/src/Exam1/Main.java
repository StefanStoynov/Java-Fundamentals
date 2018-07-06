package Exam1;

import Exam1.Abstract.Car;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CarManager carManager = new CarManager();

        String line;
        while (true) {
            if ("Cops Are Here".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "register":

                    int carId = Integer.parseInt(tokens[1]);
                    String type = tokens[2];
                    String brand = tokens[3];
                    String model = tokens[4];
                    int yearOfProduction = Integer.parseInt(tokens[5]);
                    int horsepower = Integer.parseInt(tokens[6]);
                    int acceleration = Integer.parseInt(tokens[7]);
                    int suspension = Integer.parseInt(tokens[8]);
                    int durability = Integer.parseInt(tokens[9]);
                    carManager.register(carId, type, brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);

                    break;
                case "check":
                    int carIdCheck = Integer.parseInt(tokens[1]);
                    System.out.println(carManager.check(carIdCheck));
                    break;
                case "open":

                    int raceId = Integer.parseInt(tokens[1]);
                    String raceType = tokens[2];
                    int raceLength = Integer.parseInt(tokens[3]);
                    String raceRoute = tokens[4];
                    int racePrizePool = Integer.parseInt(tokens[5]);
                    carManager.open(raceId,raceType,raceLength,raceRoute,racePrizePool);
                    break;
                case "participate":
                    int carIdParticipate = Integer.parseInt(tokens[1]);
                    int raceIdParticipate = Integer.parseInt(tokens[2]);
                    carManager.participate(carIdParticipate,raceIdParticipate);
                    break;
                case "start":
                    int raceIdStart = Integer.parseInt(tokens[1]);
                    System.out.println(carManager.start(raceIdStart));
                    break;
                case "park":
                    int carIdPark = Integer.parseInt(tokens[1]);
                    carManager.park(carIdPark);
                    break;
                case "unpark":
                    int carIdUnpark = Integer.parseInt(tokens[1]);
                    carManager.unpark(carIdUnpark);
                    break;
                case "tune":
                    int tuneIndex = Integer.parseInt(tokens[1]);
                    String addOn = tokens[2];
                    carManager.tune(tuneIndex,addOn);
                    break;
            }

        }
    }
}
