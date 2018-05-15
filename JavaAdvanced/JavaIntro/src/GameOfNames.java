package Java_Advanced.Intro_to_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> playerData = new HashMap<>();


        for (int i = 1; i <= numberOfPlayers; i++) {

            String playerName = scanner.nextLine();
            int initialPoints = Integer.parseInt(scanner.nextLine());
            char[] name = playerName.toCharArray();

            for (char s : name) {
                if (s % 2 == 0) {
                    initialPoints += s;
                } else {
                    initialPoints -= s;
                }
            }

            playerData.put(playerName, initialPoints);

        }

        int max = 0;
        String nameWinner = "";
        for (Map.Entry<String, Integer> entry : playerData.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                nameWinner = entry.getKey();
            }
        }
        System.out.printf("The winner is %s - %d points",nameWinner,max);
    }
}

