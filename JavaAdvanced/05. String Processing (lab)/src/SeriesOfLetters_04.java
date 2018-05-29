import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class SeriesOfLetters_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(line);


        for (int i = 0; i < sb.length() - 1; i++) {

            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                i--;
            }

        }

        System.out.println(sb);
    }
}
