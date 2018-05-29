import java.util.Scanner;

public class CountSubstringOccurrences_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        String pattern = scanner.nextLine().toLowerCase();
        int patternLenght = pattern.length();
        int count = 0;
        for (int i = 0; i < input.length()-patternLenght+1; i++) {
           String a = input.substring(i, patternLenght+i);

            if (a.equals(pattern)){
                count++;
            }
        }
        System.out.println(count);

    }
}
