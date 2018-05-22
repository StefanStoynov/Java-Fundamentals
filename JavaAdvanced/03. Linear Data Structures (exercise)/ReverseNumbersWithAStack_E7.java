import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithAStack_E7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]inputNumbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < inputNumbers.length; i++) {
            stack.push(inputNumbers[i]);
        }

        for (int i = 0; i < inputNumbers.length; i++) {
            System.out.print(stack.poll()+" ");
        }
    }
}
