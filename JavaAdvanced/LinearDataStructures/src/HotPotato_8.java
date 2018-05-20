import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");

        int count = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);

        while (queue.size() > 1) {
            for (int i = 1; i < count; i++) {
                String firstChild = queue.poll();
                queue.offer(firstChild);
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is "+ queue.poll());
    }
}
