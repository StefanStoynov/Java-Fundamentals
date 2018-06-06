import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class p01_StudentsByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,List<String>>students = new LinkedHashMap<>();

        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[]input  = line.split("\\s+");

            String firstName = input[0];
            String surName = input[1];
            String fullName = firstName + " " + surName;
            int group = Integer.parseInt(input[2]);
            List<String> studentsNames = new LinkedList<>();
            if (!students.containsKey(group)){
                students.put(group,studentsNames);
            }
            students.get(group).add(fullName);

        }
        students
                .entrySet()
                .stream()
                .filter(s-> s.getKey() ==2)
                .forEach( s -> s.getValue().stream().sorted().forEach(n-> System.out.println(n)));
    }

}
