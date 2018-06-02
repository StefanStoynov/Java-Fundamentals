import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class p04_FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] bounderies = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = reader.readLine();

        Predicate<Integer> isEven = (a) -> a % 2 == 0;
        Consumer<Integer> print = (a) -> System.out.print(a + " ");

        for (int i = bounderies[0]; i <= bounderies[1]; i++) {
            if (command.equals("even") && isEven.test(i)){
                print.accept(i);
            }else if (command.equals("odd")&& !isEven.test(i)){
                print.accept(i);
            }
        }
    }
}
