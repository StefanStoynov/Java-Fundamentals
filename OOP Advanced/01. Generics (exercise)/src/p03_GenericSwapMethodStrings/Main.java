package p03_GenericSwapMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Box<String> box = new Box();

        while (n-->0){
           String input= reader.readLine();
           box.addItem(input);
        }

        int[] positions = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int oldPosition = positions[1];
        int newPosition = positions[0];

        box.swapMetod(oldPosition,newPosition);

        System.out.println(box.toString());
    }
}
