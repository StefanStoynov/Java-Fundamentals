package Java_Advanced.Intro_to_Java;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();

        double rectangleArea = sideA * sideB;

        System.out.printf("%.2f",rectangleArea);
    }
}
