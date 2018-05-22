import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Set<String> cars = new HashSet<>();
        while (!"END".equals(line)) {
            String[] carData = line.split(", ");
            String direction = carData[0];
            String carPlate = carData[1];
            if ("IN".equals(direction)) {
                cars.add(carPlate);
            } else {
                cars.remove(carPlate);
            }
            line = scanner.nextLine();
        }
        if (!cars.isEmpty()) {
            for (String car : cars) {
                System.out.println(car);
            }
        }else {
            System.out.println("Parking Lot is Empty");
        }
    }
}
