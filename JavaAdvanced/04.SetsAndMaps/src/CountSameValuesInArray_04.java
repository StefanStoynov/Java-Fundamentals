import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSameValuesInArray_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]inputOfNumbers =scanner.nextLine().split("\\s+");

        Map<String,Integer> numbersCount = new HashMap<>();

        for (String number : inputOfNumbers) {
            if (!numbersCount.containsKey(number)){
                numbersCount.put(number,0);
            }
            numbersCount.put(number,numbersCount.get(number)+1);

        }
        for (Map.Entry<String, Integer> entryNumber : numbersCount.entrySet()) {
            System.out.printf("%s - %s times%n",entryNumber.getKey(),entryNumber.getValue());
        }
    }
}
