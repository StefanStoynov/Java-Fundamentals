import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class p05_FilterStudentsByEmailDomain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String > users = new LinkedHashMap<>();

        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");

            String firstName = tokens[0];
            String lastName = tokens[1];
            String email = tokens[2];
            String fullName = firstName + " " + lastName;
            if (!users.containsKey(email)){
                users.put(fullName,email);
            }


        }
        users
                .entrySet()
                .stream()
                .filter(user -> user.getValue().endsWith("@gmail.com"))
                .forEach(user -> System.out.println(String.format("%s ",user.getKey())));
    }
}
