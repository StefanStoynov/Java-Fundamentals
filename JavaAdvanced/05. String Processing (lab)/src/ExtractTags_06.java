import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;
        Pattern pattern = Pattern.compile("<.+?>");


        while (true){
            if ("END".equals(line= scanner.nextLine())){
                break;
            }
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }
}
