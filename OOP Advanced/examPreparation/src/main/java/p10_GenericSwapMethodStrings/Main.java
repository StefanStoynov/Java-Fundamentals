package p10_GenericSwapMethodStrings;

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

        String[] positions = reader.readLine().split("\\s+");
        box.swap(Integer.parseInt(positions[0]), Integer.parseInt(positions[1]));

        System.out.println(box.toString());
    }

}

