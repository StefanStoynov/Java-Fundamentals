package p10_Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] nameInput = reader.readLine().split("\\s+");
        String name = nameInput[0]+" "+nameInput[1];
        String adress = nameInput[2];

        Tuple<String,String> nameAndAdress = new Tuple<>(name,adress);
        System.out.println(nameAndAdress.toString());

        String[] personNameandLiters = reader.readLine().split("\\s+");
        Tuple<String,Integer> nameAndLiters = new Tuple<>(personNameandLiters[0],Integer.parseInt(personNameandLiters[1]));
        System.out.println(nameAndLiters.toString());

        String[] numbers = reader.readLine().split("\\s+");
        Tuple<Integer,Double> nums = new Tuple<>(Integer.parseInt(numbers[0]),Double.parseDouble(numbers[1]));
        System.out.println(nums.toString());
    }
}
