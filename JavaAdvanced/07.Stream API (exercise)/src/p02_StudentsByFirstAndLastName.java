import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p02_StudentsByFirstAndLastName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Pair<String, String>> students = new ArrayList<>();

        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] names = line.split("\\s+");

            String firstName = names[0];
            String lastName = names[1];

            Pair<String,String> fullNames = new Pair<>(firstName,lastName);
            students.add(fullNames);
        }


        students.stream()
                .filter(s -> s.getValue().compareTo(s.getKey())>0)
                .forEach(s -> System.out.println(String.format("%s %s",s.getKey(),s.getValue())));

    }
}
