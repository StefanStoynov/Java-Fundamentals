import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02_LetterExpression {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        List<Double> nums = new LinkedList<>();
        List<Integer> counts = new LinkedList<>();
        int sum = 0;
        Pattern numbers = Pattern.compile("[0-9\\\\.0-9]+");
        Pattern letters = Pattern.compile("[^\\d.]+");

        Matcher matcher1 = numbers.matcher(line);
        Matcher matcher2 = letters.matcher(line);

        while (matcher1.find()) {
            nums.add(Double.parseDouble(matcher1.group()));
        }
        while (matcher2.find()) {
            counts.add(matcher2.group().length());
        }
        int iter = 0;
        if (nums.size()==counts.size()){
            counts.remove(counts.size()-1);
        }
        for (int i = 0; i < counts.size() ; i++) {
            if (i == 0) {
                if (counts.get(iter) % 2 == 0) {
                    sum += nums.get(i) + nums.get(i + 1);

                } else {
                    sum += nums.get(i) - nums.get(i + 1);

                }
            } else {
                if (counts.get(iter) % 2 == 0) {
                    sum += nums.get(i+1);

                } else {
                    sum -= nums.get(i+1);

                }
            }
            iter++;
        }
        System.out.printf("%d", sum);
    }
}


