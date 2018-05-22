import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement_E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfComands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numberOfComands; i++) {
            String comand = scanner.nextLine();
            if ("2".equals(comand)){
                stack.pop();
            }else if("3".equals(comand)){
                System.out.println(Collections.max(stack));
            }else{
                int[]comands = Arrays.stream(comand.split("\\s+")).mapToInt(Integer::parseInt).toArray();
                int element = comands[1];
                stack.push(element);
            }


        }
    }
}
