import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p06_ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays
                .stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int devider = Integer.parseInt(reader.readLine());

        Collections.reverse(numbers);

        System.out.println();
        numbers = numbers.stream().filter(x -> x % devider != 0).collect(Collectors.toList());
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
