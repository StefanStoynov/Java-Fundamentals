import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if (num == 0) {
            System.out.println(0);
        } else {
            while (num != 0) {
                stack.push(num % 2);
                num /= 2;
            }
        }
        int iterations = stack.size();
        for (int i = 0; i <iterations ; i++) {
            System.out.print(stack.pop());
        }
    }
}
