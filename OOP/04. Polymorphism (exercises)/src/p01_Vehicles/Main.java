package p01_Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] carDetails = reader.readLine().split("\\s+");
        String[] truckDetails = reader.readLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carDetails[1]),Double.parseDouble(carDetails[2]));
        Vehicle truck = new Truck(Double.parseDouble(truckDetails[1]),Double.parseDouble(truckDetails[2]));

        int numberOfComands = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberOfComands; i++) {
            String[]commandsTokens = reader.readLine().split("\\s+");
            String command = commandsTokens[0];
            String vehicle = commandsTokens[1];
            if ("Drive".equals(command)){
                if ("Car".equals(vehicle)){
                    car.Driving(Double.parseDouble(commandsTokens[2]));
                    if (car.Driving(Double.parseDouble(commandsTokens[2]))>0){
                        System.out.println(String.format("Car travelled %s km",commandsTokens[2]));
                    }else{

                    }
                }else{
                    truck.Driving(Double.parseDouble(commandsTokens[2]));
                }
            }else{
                if ("Car".equals(vehicle)){
                    car.Refuling(Double.parseDouble(commandsTokens[2]));
                }else{
                    truck.Refuling(Double.parseDouble(commandsTokens[2]));
                }
            }
            System.out.println();

        }

    }
}
