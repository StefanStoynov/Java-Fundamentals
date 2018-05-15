package Java_Advanced.Intro_to_Java;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        int wordMin = Math.min(words[0].length(), words[1].length());
        int multiplayedSum = 0;
        for (int i = 0; i < wordMin; i++) {

            char right = words[1].charAt(i);
            char left = words[0].charAt(i);

            multiplayedSum += left * right;
        }
        int diference = Math.abs(words[0].length() - words[1].length());
        if (words[0].length() > words[1].length()) {
            for (int i = words[0].length() - diference; i < words[0].length(); i++) {
                multiplayedSum += words[0].charAt(i);
            }
        } else {
            for (int i = words[1].length() - diference; i < words[1].length(); i++) {
                multiplayedSum += words[1].charAt(i);
            }
            System.out.println(multiplayedSum);
        }
    }
}
