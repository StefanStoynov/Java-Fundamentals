package p20_Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat DF = new DecimalFormat("#.##");

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] carTokens = reader.readLine().split("\\s+");
        String[] truckTokens = reader.readLine().split("\\s+");


        Vechicle car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]));
        Vechicle truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]));

        int num = Integer.parseInt(reader.readLine());
        while (num-->0){
            String[]tokens = reader.readLine().split("\\s+");
            String command = tokens[0];
            String vehicle = tokens[1];
            double number = Double.parseDouble(tokens[2]);
            if ("Drive".equals(command)){
                executeDrivecommand(vehicle,car,truck,number);
            }else {
                executeRefuelCommand(vehicle,car,truck,number);
            }

        }
        System.out.println(car);
        System.out.println(truck);

    }

    private static void executeRefuelCommand(String vehicle, Vechicle car, Vechicle truck, double number) {
        double refuelLiters = number;
        switch (vehicle){
            case"Car":
                car.Refuel(refuelLiters);
                break;
            case "Truck":
                truck.Refuel(refuelLiters);
                break;
        }
    }

    private static void executeDrivecommand(String vehicle, Vechicle car, Vechicle truck, double number) {
        double distance = number;
        switch (vehicle){
            case "Car":
                if (car.Drive(distance)){
                    System.out.println(String.format("Car travelled %s km", DF.format(distance)));
                }else{
                    System.out.println("Car needs refueling");
                }
                break;
            case"Truck":
                if (truck.Drive(distance)){
                    System.out.println(String.format("Truck travelled %s km", DF.format(distance)));
                }else{
                    System.out.println("Truck needs refueling");
                }
                break;
        }

    }
}
