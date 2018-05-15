package Java_Advanced.Intro_to_Java;

import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i < 21; i++) {
            for (int j = 1; j < 21; j++) {
                boolean pass = false;
                if (i + j == num && pass == false) {
                    pass = true;
                    System.out.printf("%d + %d = %d\n", i, j, num);

                }
                if (i - j == num && pass == false) {
                    pass = true;
                    System.out.printf("%d - %d = %d\n", i, j, num);
                }

            }
        }
    }
}
