import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class p01_SortEvenNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        StringBuilder ordered = new StringBuilder();

        Arrays.stream(reader.readLine().split(", "))
                .map(Integer::parseInt)
                .filter(x -> x % 2 == 0)
                .peek(x -> sb.append(x).append(", "))
                .sorted(Comparator.naturalOrder())
                .forEach(x -> ordered.append(x).append(", "));

        if (ordered.length()!=0){
            System.out.println(sb.deleteCharAt(sb.length()-2));
            System.out.println(ordered.deleteCharAt(ordered.length()-2));
        }

    }
}
