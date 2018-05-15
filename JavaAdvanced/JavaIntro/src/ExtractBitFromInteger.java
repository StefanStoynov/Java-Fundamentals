package Java_Advanced.Intro_to_Java;

import java.util.Scanner;

public class ExtractBitFromInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int num2 = scanner.nextInt();

        int mask = num >> num2;
        int result = 1 & mask;

        System.out.println(result);
    }
}
