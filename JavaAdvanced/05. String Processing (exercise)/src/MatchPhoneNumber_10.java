import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_10 {
    public static void main(String[] args) {
        String regex = "^\\+359(\\s|-)2\1(\\d{3})\1(\\d{4})$";
        Scanner scanner = new Scanner(System.in);

        String line;

        while (true){
            if ("end".equals(line = scanner.nextLine())){
                break;
            }
            if (Pattern.matches(regex,line)){
                System.out.println(line);
            }
        }
    }
}
