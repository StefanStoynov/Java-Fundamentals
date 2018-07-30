package p02_GenericArrayCreator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]arr = ArrayCreator.create(String.class,10,"ss");

        for (String s : arr) {
            System.out.println(s);
        }

    }
}
