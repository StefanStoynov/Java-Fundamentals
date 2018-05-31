import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class LettersChangeNumbers_07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        double totalSum = 0D;
        for (int i = 0; i < input.length; i++) {
            totalSum+=sumNumber(input[i]);
        }
        System.out.printf("%.2f",totalSum);

    }

    private static double sumNumber(String num) {
        double sum = 0;
        int number = Integer.parseInt(num.substring(1,num.length()-1));
        char fistChar = num.charAt(0);
        char lastChar = num.charAt(num.length()-1);
        if (fistChar>='A'&&fistChar<='Z'){
           sum = number/(fistChar-'A'+1*1.0);
        }else{
            sum = number * (fistChar-'a'+1);
        }
        if (lastChar>='a'&& lastChar<='z'){
            sum = sum + (lastChar-'a'+1);
        }else{
            sum = sum - (lastChar-'A'+1);
        }
        return sum;
    }
}
