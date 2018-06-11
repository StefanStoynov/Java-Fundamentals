import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03_Genome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("([A-Za-z(!@#$?)*]+)=([0-9]+)--([0-9]+)<<([a-z]+)");
        Map<String, Integer> information = new LinkedHashMap<>();
        String line;
        while (true) {
            if ("Stop!".equals(line = reader.readLine())) {
                break;
            }
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                char[] firstPart = matcher.group(1).toCharArray();
                int firstPartCompare = Integer.parseInt(matcher.group(2));
                int lettersFirstPart = 0;
                for (int i = 0; i < firstPart.length; i++) {
                    if (Character.isLetter(firstPart[i])) {
                        lettersFirstPart++;
                    }
                }
                if (firstPartCompare != lettersFirstPart) {
                    continue;
                }
                int genomSize = Integer.parseInt(matcher.group(3));
                String name = matcher.group(4);
                if (!information.containsKey(name)) {
                    information.putIfAbsent(name, genomSize);
                } else {
                    int oldSize = information.get(name);
                    int newSize = oldSize + genomSize;
                    information.put(name, newSize);
                }
            }
        }
        information.entrySet().stream().sorted((x1,x2)-> x2.getValue().compareTo(x1.getValue()))
                .forEach(x-> System.out.println(String.format("%s has genome size of %d", x.getKey(), x.getValue())));






    }
}
