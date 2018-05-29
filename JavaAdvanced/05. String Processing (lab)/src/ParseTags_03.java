import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseTags_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int firstIndex = line.indexOf("<upcase>");

        while (firstIndex != -1) {
            int lastIndex = line.indexOf("</upcase>");
            String replaceWords = line.substring(firstIndex + 8, lastIndex);
            line = line.replaceFirst(replaceWords, replaceWords.toUpperCase());
            line = line.replaceFirst("<upcase>", "");
            line = line.replaceFirst("</upcase>", "");

            firstIndex = line.indexOf("<upcase>");
        }
        System.out.println(line);
    }
}




