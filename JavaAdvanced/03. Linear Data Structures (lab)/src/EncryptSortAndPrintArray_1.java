import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String[] names = new String[num];
        int[] sums = new int[num];

        for (int i = 0; i < num; i++) {
            int sum = 0;
            String name = scanner.nextLine();
            names[i] = name;
            for (int j = 0; j < name.length(); j++) {
                if (isVowel(name.charAt(j))) {
                    sum += name.charAt(j) * name.length();
                } else {
                    sum += name.charAt(j) / name.length();
                }
            }
            sums[i] = sum;

        }
        Arrays.sort(sums);
        for (int sum : sums) {
            System.out.println(sum);
        }

    }

    public static boolean isVowel(char letter) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        boolean isVowel = false;
        for (char vowel : vowels) {
            if (vowel == Character.toLowerCase(letter)) {
                isVowel = true;
                break;
            }
        }

        return isVowel;
    }
}