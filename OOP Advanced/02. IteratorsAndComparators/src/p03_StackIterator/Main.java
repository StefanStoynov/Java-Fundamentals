package p03_StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomStack<Integer> customStack = new CustomStack<>();
        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] commands = line.split("[ | ,]+");

            switch (commands[0]) {
                case "Push":
                  int[]nums =  Arrays.stream(commands).skip(1).mapToInt(Integer::parseInt).toArray();

                    for (int element :nums) {
                        customStack.push(element);
                    }
                    break;
                case "Pop":
                    customStack.pop();
                    break;
            }
        }
        for (Integer integer : customStack) {
            System.out.println(integer);
        }
        for (Integer integer : customStack) {
            System.out.println(integer);
        }
    }
}
