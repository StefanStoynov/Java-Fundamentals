package p05_NullFinder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer>integers = new ArrayList<>();
        Collections.addAll(integers,1,2,3,null,null,5);

        List<Integer>nulls = ListUtils.getNullIndices(integers);
        for (Integer aNull : nulls) {
            System.out.println(aNull);
        }
    }
}
