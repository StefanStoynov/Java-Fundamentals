package p05_GenericCountMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfItems = Integer.parseInt(reader.readLine());
        Box <String> box = new Box<>();
        while (numberOfItems-->0){
            String item  = reader.readLine();
            box.addItem(item);
        }
        String comparableItem = reader.readLine();
        System.out.println(box.returnMethod(comparableItem));
    }
}
