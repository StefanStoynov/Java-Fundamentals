import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class p06_FilterStudentsByPhone {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> phoneBook = new LinkedHashMap<>();

        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");

            String firstName = tokens[0];
            String lastName = tokens[1];
            String phoneNumber = tokens[2];
            String fullName = firstName + " " + lastName;
            
            phoneBook.putIfAbsent(fullName, phoneNumber);
        }
        phoneBook
                .entrySet()
                .stream()
                .filter(u -> u.getValue().startsWith("+3592") || u.getValue().startsWith("02"))
                .forEach(u -> System.out.println(u.getKey()));
    }
}
