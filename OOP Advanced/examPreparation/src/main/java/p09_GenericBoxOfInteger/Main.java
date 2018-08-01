package p09_GenericBoxOfInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Box>boxes = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());

        while (n-->0){
            int line = Integer.parseInt(reader.readLine());

            Box<Integer> box = new Box<>(line);
            boxes.add(box);
        }

        for (Box box : boxes) {
            System.out.println(box.toString());
        }

    }
}
