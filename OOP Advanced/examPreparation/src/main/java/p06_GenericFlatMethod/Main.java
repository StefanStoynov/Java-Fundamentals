package p06_GenericFlatMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 2, 3, 4);

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 1.2, 1.3, 1.5);

        List<List<? extends Number>> jaged = new ArrayList<>();
        Collections.addAll(jaged,doubles,integers);

        List<Number> dest = new ArrayList<>();
        ListUtils.flatten(dest,jaged);
        System.out.println(dest);
    }
}
