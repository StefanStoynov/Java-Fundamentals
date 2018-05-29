import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LittleAlchemy_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stones = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            stones.add(nums[i]);
        }
        int storrage = 0;
        String input;
        while (true) {
            if ("Revision".equals(input = scanner.nextLine())) {
                break;
            }


            String[] commands = input.split("\\s+");
            String command = commands[0];
            int num = Integer.parseInt(commands[2]);
            if ("Apply".equals(command)) {

                for (int i = 0; i < num; i++) {
                    if (stones.isEmpty()) {
                        break;
                    }
                    int element = stones.poll();
                    int newElement = element - 1;
                    if (newElement <= 0) {
                        storrage++;
                    } else {
                        stones.add(newElement);
                    }
                }
            } else {
                if (storrage>0){
                    stones.add(num);
                    storrage--;
                }else {
                    continue;
                }

            }

        }
        String result = "";
        for (Integer stone : stones) {
            result+= stone+" ";
        }
        System.out.println(result);
        System.out.println(storrage);
    }
}
