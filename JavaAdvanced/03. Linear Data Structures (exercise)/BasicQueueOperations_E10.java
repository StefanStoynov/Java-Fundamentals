import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations_E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] comands = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int numbersAdd = comands[0];
        int numbersDelete = comands[1];
        int numberCheck = comands[2];

        int[] numbersOfQueue = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numbersAdd; i++) {
            queue.add(numbersOfQueue[i]);
        }
        for (int i = 0; i < numbersDelete; i++) {
            if (queue.isEmpty()){
                break;
            }
            queue.poll();
        }
        if (queue.isEmpty()){
            System.out.println(0);
        }else if (queue.contains(numberCheck)){
            System.out.println("true");
        }else{
            System.out.println(Collections.min(queue));
        }


    }
}
