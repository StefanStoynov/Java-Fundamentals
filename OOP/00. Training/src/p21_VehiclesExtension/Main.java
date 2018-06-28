package p21_VehiclesExtension;

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
        String[] busTokens = reader.readLine().split("\\s+");

        //Vehicle {initial fuel quantity} {liters per km} {tank capacity}
        Vechicle car = new Car(Double.parseDouble(carTokens[1]), Double.parseDouble(carTokens[2]), Double.parseDouble(carTokens[3]));
        Vechicle truck = new Truck(Double.parseDouble(truckTokens[1]), Double.parseDouble(truckTokens[2]), Double.parseDouble(truckTokens[3]));
        Vechicle bus = new Bus(Double.parseDouble(busTokens[1]), Double.parseDouble(busTokens[2]), Double.parseDouble(busTokens[3]));

        int num = Integer.parseInt(reader.readLine());
        while (num-- > 0) {
            try {
                String[] tokens = reader.readLine().split("\\s+");
                String command = tokens[0];
                String vehicle = tokens[1];
                double number = Double.parseDouble(tokens[2]);
                if ("Drive".equals(command)) {
                    executeDrivecommand(vehicle, car, truck, bus, number);
                } else if ("DriveEmpty".equals(command)) {
                    excuteDriveEmpty(vehicle, bus, number);
                } else {
                    executeRefuelCommand(vehicle, car, truck, bus, number);
                }
            }catch (IllegalArgumentException iae){
                System.out.println(iae  .getMessage());

            }
        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);

    }

    private static void excuteDriveEmpty(String vehicle, Vechicle bus, double number) {
        if (((Bus)bus).driveEmpty(number)){
            System.out.println(String.format("Car travelled %s km", DF.format(number)));
        }else{
            System.out.println("Bus needs refueling");
        }
    }

    private static void executeRefuelCommand(String vehicle, Vechicle car, Vechicle truck, Vechicle bus, double number) {
        double refuelLiters = number;
        switch (vehicle) {
            case "Car":
                car.Refuel(refuelLiters);
                break;
            case "Truck":
                truck.Refuel(refuelLiters);
                break;
            case "Bus":
                bus.Refuel(refuelLiters);
                break;
        }
    }

    private static void executeDrivecommand(String vehicle, Vechicle car, Vechicle truck, Vechicle bus, double number) {
        double distance = number;
        switch (vehicle) {
            case "Car":
                if (car.Drive(distance)) {
                    System.out.println(String.format("Car travelled %s km", DF.format(distance)));
                } else {
                    System.out.println("Car needs refueling");
                }
                break;
            case "Truck":
                if (truck.Drive(distance)) {
                    System.out.println(String.format("Truck travelled %s km", DF.format(distance)));
                } else {
                    System.out.println("Truck needs refueling");
                }
                break;
            case "Bus":
                if (bus.Drive(distance)) {
                    System.out.println(String.format("Bus travelled %s km", DF.format(distance)));
                } else {
                    System.out.println("Bus needs refueling");
                }
                break;
            case "DriveEmpty":
                if (bus.Drive(distance)) {
                    System.out.println(String.format("Bus travelled %s km", DF.format(distance)));
                } else {
                    System.out.println("Bus needs refueling");
                }
                break;
        }

    }
}
