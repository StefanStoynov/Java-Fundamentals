import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BalancedParentheses_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");

        ArrayDeque<String> stack = new ArrayDeque<>();

        boolean balanced = false;

        if (input[0].equals("]")||input[0].equals("}")||input[0].equals(")")||input.length%2!=0){
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("[") || input[i].equals("{") || input[i].equals("(")) {
                stack.push(input[i]);
            }
            else if (input[i].equals("]") || input[i].equals("}") || input[i].equals(")")) {
                String check1 = stack.pop();
                String check2 = input[i];
                String check = check1 + check2;
                if (check.equals("[]") || check.equals("()") || check.equals("{}")) {
                    balanced = true;
                } else {
                    balanced = false;
                    break;
                }
            }
        }

        if (balanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
