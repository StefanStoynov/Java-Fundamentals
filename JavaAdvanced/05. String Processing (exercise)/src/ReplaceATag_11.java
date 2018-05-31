import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceATag_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            sb.append(line + "\n");
        }
        String result = sb.toString();
        Pattern pattern = Pattern.compile("(<a)\\s+href=.+?(>)\\s*.+?(<\\/a>)");
        Matcher matcher = pattern.matcher(result);

        while (matcher.find()) {
            String entireGroups = matcher.group();
            String openTagFirstPart = matcher.group(1);
            String openTagSecondPart = matcher.group(2);
            String closingTag = matcher.group(3);
            String replacement = entireGroups;
            replacement = replacement
                    .replaceFirst(openTagFirstPart, "[URL")
                    .replaceFirst(openTagSecondPart, "]")
                    .replaceFirst(closingTag, "[/URL]");
            result = result.replace(entireGroups, replacement);
        }
        System.out.println(result);
    }
}
