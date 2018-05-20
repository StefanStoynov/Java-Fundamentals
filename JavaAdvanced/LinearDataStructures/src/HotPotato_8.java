import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String children = scanner.nextLine();

        int count = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);

        while (queue.size() > 1) {
            for (int i = 0; i < queue.size(); i++) {
                if (i == count){
                    queue.poll();
                }
            }
        }
    }
}
