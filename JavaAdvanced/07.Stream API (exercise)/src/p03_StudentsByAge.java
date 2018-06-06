import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p03_StudentsByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Pair<String ,Integer>> students = new ArrayList<>();

        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] student = line.split("\\s+");

            String firstName = student[0];
            String lastName = student[1];
            int age = Integer.parseInt(student[2]);
            String fullName = firstName+ " " + lastName;

            Pair<String,Integer> input = new Pair<>(fullName,age);
            students.add(input);
        }
        students.stream().filter(s-> s.getValue()>=18 && s.getValue()<=24)
                .forEach(s-> System.out.println(String.format("%s %d",s.getKey(),s.getValue())));
    }
}
