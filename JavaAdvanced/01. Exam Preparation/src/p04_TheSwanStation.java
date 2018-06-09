import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class p04_TheSwanStation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[]firstNumbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[]secondNumbers = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> queuePrint = new ArrayDeque<>();
        for (int i = 0; i < secondNumbers.length; i++) {
            queue.add(secondNumbers[i]);
        }

        for (int i = 0; i < firstNumbers.length; i++) {
            if (queue.isEmpty()|| queuePrint.size()>6){
                break;
            }
            else if(queue.peek()%firstNumbers[i]==0){
                queuePrint.add(queue.peek());
                queue.removeFirst();
            }else{
                int number = queue.peek();
                queue.removeFirst();
                number++;
                queue.add(number);
                i--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer number : queuePrint) {
            sb.append(number).append(", ");
        }
        sb.deleteCharAt(sb.length()-2);
        System.out.println(sb);
    }
}
