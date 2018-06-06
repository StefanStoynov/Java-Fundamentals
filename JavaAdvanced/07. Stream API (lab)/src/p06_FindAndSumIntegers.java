import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;

public class p06_FindAndSumIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Sum -3 and -4
        String[] line = reader.readLine().split("\\s+");

        int sum = Arrays.stream(line).filter(x -> x.length() > 0)
                .filter(x -> {
                    try {
                        Integer.parseInt(x);
                        return true;
                    } catch (NumberFormatException nfe) {
                        return false;
                    }
                })
                .mapToInt(Integer::parseInt)
                .sum();
        if (sum!=0){
            System.out.println(sum);
        }else{
            System.out.println("No match");
        }

    }
}
