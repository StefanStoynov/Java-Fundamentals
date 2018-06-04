import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class p10_ListOfPredicates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lenght = Integer.parseInt(reader.readLine());

        String[] nums = reader.readLine().split("\\s+");
        Set<Integer> deviders = new HashSet<>();

        for (String num : nums) {
            deviders.add(Integer.parseInt(num));
        }
        Predicate<Integer> isDevider = a -> {
            for (Integer divider : deviders) {
                if (a % divider != 0) {
                    return false;
                }
            }
            return true;
        };
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= lenght; i++) {
            if (isDevider.test(i)){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}
