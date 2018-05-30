import java.util.Scanner;

public class UnicodeCharacters_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
          String append =   String.format("\\u00%x",(int)word.charAt(i));
          sb.append(append);
        }
        System.out.println(sb);
    }
}
