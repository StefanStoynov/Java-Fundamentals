import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Pattern pattern = Pattern.compile("[AEIOUYaeiouy]");
        Matcher matcher = pattern.matcher(line);


        int vowelsCount = 0;
        while (matcher.find()) {

            vowelsCount++;

        }

        System.out.println("Vowels: " + vowelsCount);
    }
}
