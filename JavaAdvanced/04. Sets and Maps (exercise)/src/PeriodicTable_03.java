import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Set<String> uniqElements = new TreeSet<>();

        for (int i = 0; i < num; i++) {
            String[]elements = scanner.nextLine().split("\\s+");

            for (int j = 0; j < elements.length; j++) {
                uniqElements.add(elements[j]);
            }
        }
        for (String element : uniqElements) {
            System.out.print(element + " ");
        }
    }
}
