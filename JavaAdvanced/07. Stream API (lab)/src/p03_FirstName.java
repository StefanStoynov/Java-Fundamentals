import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

public class p03_FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] names = reader.readLine().split(" ");
        String[] words = reader.readLine().toUpperCase().split(" ");

        Optional<String> firstMatch = Arrays
                .stream(names)
                .sorted()
                .filter(x -> {
                    for (String word : words) {
                        if ((x.charAt(0)+"").equalsIgnoreCase(word)){
                            return true;
                        }

                    }
                    return false;
                })
                .findFirst();
        if (firstMatch.isPresent()) {
            System.out.println(firstMatch.get());
        } else {
            System.out.println("No matches");
        }


    }
}
