import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class p07_ExcellentStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> students = new LinkedHashMap<>();

        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+", 3);

            String fullName = tokens[0] + " " + tokens[1];
            String grades = tokens[2];

            students.putIfAbsent(fullName, grades);

        }
        students.entrySet().stream().filter(s -> s.getValue().contains("6")).forEach(s -> System.out.println(s.getKey()));
    }
}
