

import java.lang.reflect.Array;
import java.util.*;

public class VehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vehiclePark = scanner.nextLine().split("\\s+");
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(vehiclePark));
        String customerOrder = scanner.nextLine();
        int soldVechicles = 0;
        while (!"End of customers!".equals(customerOrder)) {

            customerOrder = customerOrder.toLowerCase();
            String[] order = customerOrder.split("\\s+");

            char vehicleType = order[0].charAt(0);
            String seats = order[2];

            String compareOrder = vehicleType + seats;

            if (list.contains(compareOrder)) {
                int carPrice = vehicleType * Integer.parseInt(seats);
                soldVechicles++;
                list.remove(compareOrder);
                System.out.printf("Yes, sold for %d$%n",carPrice);

            }else{
                System.out.println("No");
            }


            customerOrder = scanner.nextLine();


        }
        System.out.print("Vehicles left: ");
        System.out.printf("%s%n", list.toString().substring(1, list.toString().length() - 1));
        System.out.printf("Vehicles sold: %d%n",soldVechicles);

    }
}
