import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MatchingBrackets_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer>expresion = new ArrayDeque<>();

        for (int i = 0; i <input.length() ; i++) {
            char symbol = input.charAt(i);
            if ('(' == symbol) {
                expresion.push(i);
            }else if (')' == symbol){
                int startIndex = expresion.pop();
                String sub = input.substring(startIndex,i+1);
                System.out.println(sub);
            }
        }


    }
}
