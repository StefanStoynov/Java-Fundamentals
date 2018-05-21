import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations_E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int stackLenght = commands[0];
        int numberOfPushedElements = commands[1];
        int numberToCheck = commands[2];

        int[] nums = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < stackLenght; i++) {
            stack.push(nums[i]);
        }
        for (int i = 0; i < numberOfPushedElements; i++) {
            if (stack.isEmpty()) {
                break;
            }
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(numberToCheck)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(stack));
        }

    }
}

