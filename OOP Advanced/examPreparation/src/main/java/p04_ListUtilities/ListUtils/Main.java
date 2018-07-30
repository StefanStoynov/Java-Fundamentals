package p04_ListUtilities.ListUtils;

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
        Collections.addAll(integers,1,2,3,4,5);

        System.out.println(ListUtils.getMax(integers));
        System.out.println(ListUtils.getMin(integers));

    }
}
