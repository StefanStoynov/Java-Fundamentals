package p06_GenericCountMethodDoubles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfItems = Integer.parseInt(reader.readLine());
        Box<Double> box = new Box<>();
        while (numberOfItems-->0){
           double item  = Double.parseDouble(reader.readLine());
            box.addItem(item);
        }
        double comparableItem = Double.parseDouble(reader.readLine());
        System.out.println(box.returnMethod(comparableItem));
    }
}
