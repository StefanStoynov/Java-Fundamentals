import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, input);
        while (stack.size() != 1) {
            int sum = 0;
            int first = Integer.parseInt(stack.pop());
            String operand = stack.pop();
            int second = Integer.parseInt(stack.pop());
            if ("+".equals(operand)) {
                sum = first + second;
            } else {
                sum = first - second;
            }
            stack.push(String .valueOf(sum));
        }
        System.out.println(stack.pop());
    }
}
