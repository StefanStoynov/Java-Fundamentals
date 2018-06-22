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
    }
}
