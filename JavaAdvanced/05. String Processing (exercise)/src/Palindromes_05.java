import java.util.*;
import java.util.stream.Collectors;

public class Palindromes_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String > list = new TreeSet<>();

        String[] text = scanner.nextLine().split("[\\s\\\\.,?!]+");
        for (String word : text) {
            if (isPalindrome(word)) {
                list.add(word);
            }
        }

        System.out.println(list);

    }

    public static boolean isPalindrome(String word) {
        boolean isPallindrome = false;
        if (word.length() == 1) {
            isPallindrome = true;
        }
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
                isPallindrome = true;
            } else {
                isPallindrome = false;
            }
        }
        return isPallindrome;
    }
}
