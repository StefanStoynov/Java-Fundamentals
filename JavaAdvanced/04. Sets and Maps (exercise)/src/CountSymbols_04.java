import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character,Integer> charCounter = new TreeMap<>();

        for (int i = 0; i <input.length() ; i++) {
            char ch = input.charAt(i);
           if (!charCounter.containsKey(ch)){
               
           }
        }
    }
}
