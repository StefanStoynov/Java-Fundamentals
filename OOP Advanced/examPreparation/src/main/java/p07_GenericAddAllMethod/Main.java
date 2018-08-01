package p07_GenericAddAllMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 2, 3, 4);

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 1.2, 1.3, 1.5);

        List<Number>destination = new ArrayList<>();
        ListUtils.addAll(destination,integers);
        ListUtils.addAll(destination,doubles);
        System.out.println(destination);
    }
}
