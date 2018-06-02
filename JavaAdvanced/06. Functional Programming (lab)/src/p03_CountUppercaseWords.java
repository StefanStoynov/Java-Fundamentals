import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class p03_CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] text = reader.readLine().split("\\s+");

        Predicate<String> isUpper = word -> {
            if (word.charAt(0) == word.toUpperCase().charAt(0)) {
                return true;
            }
            return false;
        };

        List<String >upperWords = new ArrayList<>();

        int count = 0;
        for (String word : text) {
            if (isUpper.test(word)) {
                count++;
                upperWords.add(word);
            }
        }
        System.out.println(count);
        for (String upperWord : upperWords) {
            System.out.println(upperWord);
        }

    }
}
