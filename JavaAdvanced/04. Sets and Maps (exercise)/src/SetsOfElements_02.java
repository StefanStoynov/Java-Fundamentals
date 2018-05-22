import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lenght = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        Set<Integer> numbers1 = new LinkedHashSet<>();
        Set<Integer> numbers2 = new LinkedHashSet<>();

        for (int i = 0; i < lenght[0]; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers1.add(number);
        }
        for (int i = 0; i < lenght[1]; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers2.add(number);
        }


        for (Integer integer : numbers1) {
            if (numbers2.contains(integer)) {
                System.out.print(integer + " ");
            }
        }
    }
}
