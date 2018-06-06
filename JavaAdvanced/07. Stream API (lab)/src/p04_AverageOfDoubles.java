import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class p04_AverageOfDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = reader.readLine().split("\\s+");


        OptionalDouble avarege = Arrays
                .stream(nums)
                .filter(x-> x.length()>0)
                .mapToDouble(Double::parseDouble)
                .average();

        if (avarege.isPresent()) {
            System.out.printf("%.2f", avarege.getAsDouble());
        } else {
            System.out.println("No match");
        }


    }
}
