import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class p09_CustomComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbersArray = reader.readLine().split("\\s+");
        Integer[] numbers = new Integer[numbersArray.length];

        for (int i = 0; i < numbersArray.length; i++) {
            numbers[i] = Integer.parseInt(numbersArray[i]);
        }

        Comparator<Integer> customComparator = (a, b) -> {
            boolean firstIsEven = a % 2 == 0;
            boolean secondIsEven = b % 2 == 0;

            if (firstIsEven && !secondIsEven) {
                return -1;
            } else if (!firstIsEven && secondIsEven) {
                return +1;
            } else {
                return a - b;
            }
        };

        Arrays.sort(numbers,customComparator);

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
