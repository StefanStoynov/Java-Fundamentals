package p12_GenericCountMethodString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<String> list = new ArrayList<>();
        while (n-- > 0) {
            String line = reader.readLine();
            list.add(line);
        }
        Box<String> box = new Box<>(list);

        String element = reader.readLine();
        int numberOfElements = box.greaterElements(element);

        System.out.println(numberOfElements);
    }

}

