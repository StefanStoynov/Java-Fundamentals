
import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchFullName_09 {
    public static void main(String[] args) {


        String regex = "^[A-Z][a-z]+ [A-Z][a-z]+$";
        Scanner scanner = new Scanner(System.in);
        String text;

        while (true) {
            if ("end".equals(text = scanner.nextLine())){
                break;
            }
            if (Pattern.matches(regex, text)) {
                System.out.println(text);
            }
        }

    }
}
