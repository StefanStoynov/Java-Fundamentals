package p13_GenericCountMethodDouble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Double> list = new ArrayList<>();
        while (n-- > 0) {
           double line = Double.parseDouble(reader.readLine());
            list.add(line);
        }
        Box<Double> box = new Box<>(list);

        double element = Double.parseDouble(reader.readLine());
        int numberOfElements = box.greaterElements(element);

        System.out.println(numberOfElements);
    }

}

