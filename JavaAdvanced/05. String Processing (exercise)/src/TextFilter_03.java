import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFilter_03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] bannedWords = reader.readLine().split(", ");
        String text = reader.readLine();
        String word = bannedWords[1];

        if (text.matches(word)){
            text.replaceAll(word,"@@@@@@@");
        }
        System.out.println(text);
    }
}
