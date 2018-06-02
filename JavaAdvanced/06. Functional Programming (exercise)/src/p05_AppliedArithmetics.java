import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class p05_AppliedArithmetics {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<Integer, Integer> increment = number -> ++number;
        Consumer<Integer> print = number -> System.out.println(number + " ");
        String line;
        while (true) {
            if ("print".equals(line = reader.readLine())) {
                break;
            }

            switch (line) {
                case "add":
                    for (int number : numbers) {
                    }
                    break;
                case "print":
                    for (int number : numbers) {
                        print.accept(number);
                    }
                    break;
            }

        }
    }
}
