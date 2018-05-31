import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicExchangeableWords_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        String longerWord = words[0];
        String shorterWord = words[1];

        if (longerWord.length() > shorterWord.length()) {
            if (isExchangeble(shorterWord, longerWord)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            if (isExchangeble(longerWord, shorterWord)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }

    private static boolean isExchangeble(String shortWord, String longWord) {
        Map<Character, Character> word = new LinkedHashMap<>();
        int difference = longWord.length();
        for (int i = 0; i < shortWord.length(); i++, difference--) {
            if (!word.containsKey(shortWord.charAt(i)) && !word.containsValue(shortWord.charAt(i))) {
                word.put(shortWord.charAt(i), longWord.charAt(i));
            } else {
                if (shortWord.charAt(i) != longWord.charAt(i)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        char[] rest;
        rest = longWord.substring(shortWord.length()).toCharArray();
        for (Character character : rest) {
            if (!word.containsKey(character) || !word.containsValue(character)) {
                return false;
            }

        }
        return true;
    }
}
