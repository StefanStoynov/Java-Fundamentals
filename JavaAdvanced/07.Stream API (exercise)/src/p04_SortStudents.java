import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p04_SortStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Pair<String, String>> students = new ArrayList<>();

        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }

            String[] input = line.split("\\s+");
            String firstName = input[0];
            String surName = input[1];

            Pair<String, String> student = new Pair<>(firstName, surName);
            students.add(student);
        }
        students.stream()
                .sorted((s1, s2) -> {
                    int compByLastName = s1.getValue().compareTo(s2.getValue());
                    if (compByLastName != 0) {
                        return compByLastName;
                    }
                    int compByFirstName = s2.getKey().compareTo(s1.getKey());
                    return compByFirstName;
                }).forEach(s->System.out.println(String.format("%s %s",s.getKey(),s.getValue())));


    }
}
