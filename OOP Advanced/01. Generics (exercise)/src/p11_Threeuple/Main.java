package p11_Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] nameInput = reader.readLine().split("\\s+");
        String name = nameInput[0] + " " + nameInput[1];
        String adress = nameInput[2];
        String town = nameInput[3];

        Threeuple<String, String, String> nameAndAdress = new Threeuple<>(name, adress, town);
        System.out.println(nameAndAdress.toString());

        String[] personNameandLiters = reader.readLine().split("\\s+");
        Threeuple<String, Integer, Boolean> nameAndLiters =
                new Threeuple<>(personNameandLiters[0], Integer.parseInt(personNameandLiters[1]), isDrunk(personNameandLiters[2]));
        System.out.println(nameAndLiters.toString());

        String[] numbers = reader.readLine().split("\\s+");

        DecimalFormat df = new DecimalFormat("0.0#");
        Threeuple<String, String ,String> nums = new Threeuple<>(numbers[0], df.format(Double.parseDouble(numbers[1])),numbers[2]);
        System.out.println(nums.toString());
    }

    public static boolean isDrunk(String parameter) {
        if (parameter.equals("drunk")) {
            return true;
        }
        return false;
    }
}
