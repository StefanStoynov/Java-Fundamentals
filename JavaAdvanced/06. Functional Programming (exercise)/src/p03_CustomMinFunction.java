import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;

public class p03_CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> minElement = (a) -> {
            int max = Integer.MAX_VALUE;
            for (int number : a) {
                if (number < max) {
                    max = number;
                }
            }
            return max;
        };

        System.out.println(minElement.apply(numbers));
    }
}
