package Java_Advanced.Intro_to_Java;

import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double f1First = ((a * a) + (b * b)) / ((a * a) - (b * b));
        double f1Second = (a + b + c) / Math.sqrt(c);
        double f1 = Math.pow(f1First, f1Second);


        double f2First = (a * a + b * b - Math.pow(c, 3));
        double f2Second = (a - b);
        double f2 = Math.pow(f2First, f2Second);

        double absFirs = (a + b + c) / 3;
        double absSecond = (f1 + f2) / 2;
        double abs = Math.abs(absFirs -absSecond);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, abs);
    }
}
