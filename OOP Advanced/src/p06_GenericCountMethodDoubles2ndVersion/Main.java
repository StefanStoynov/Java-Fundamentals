package p06_GenericCountMethodDoubles2ndVersion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Box<Double>> boxes = new ArrayList<>();
        int numberOfInputs = Integer.parseInt(reader.readLine());

        while (numberOfInputs-->0){
            double input = Double.parseDouble(reader.readLine());
            Box<Double> box = new Box(input);
            boxes.add(box);
        }

        double numberCheck = Double.parseDouble(reader.readLine());
        Box<Double> box = new Box(numberCheck);

        System.out.println(Compare(boxes, box));


    }
    public static <T extends Comparable<T>> int Compare(List<Box<T>>elements, Box<T>singleElement){
        return elements
                .stream()
                .filter(e -> e.getElement().compareTo(singleElement.getElement())>0)
                .collect(Collectors.toList())
                .size();
    }
}
