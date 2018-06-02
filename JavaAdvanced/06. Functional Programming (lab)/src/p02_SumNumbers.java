import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class p02_SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(reader.readLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for (int num : nums) {
            sum+=num;
        }


        System.out.println("Count = "+nums.length);
        System.out.println("Sum = "+ sum);
    }
}
