import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;

public class p05_MinEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //3.14 -2.00 1.33
        OptionalDouble min = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .filter(x -> x.length() > 0)
                .mapToDouble(Double::parseDouble)
                .filter(x -> x % 2 == 0)
                .min();

        if (min.isPresent()) {
            System.out.printf("%.2f", min.getAsDouble());
        } else {
            System.out.println("No match");
        }
    }
}
