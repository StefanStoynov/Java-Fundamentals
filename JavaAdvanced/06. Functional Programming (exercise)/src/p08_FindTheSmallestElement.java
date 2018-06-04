import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p08_FindTheSmallestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nums = Arrays
                .stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Function<List<Integer>, Integer> minElement = element -> {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < element.size(); i++) {
                if (element.get(i)<= min){
                    min = element.get(i);
                    index = i;
                }
            }
            return index;
        };
        System.out.println(minElement.apply(nums));

    }
}
