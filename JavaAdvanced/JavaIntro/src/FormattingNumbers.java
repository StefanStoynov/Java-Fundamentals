package Java_Advanced.Intro_to_Java;


import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        String hexadecimal = Integer.toHexString(num1);
        String binary = Integer.toBinaryString(num1);

        String a = hexadecimal;

        for (int i = a.length(); i < 10; i++) {
            a += " ";
        }


        if (binary.length() < 10) {
            StringBuilder b = new StringBuilder();

            int iteractions = 10 - binary.length();
            for (int i = 0; i < iteractions; i++) {
                b.insert(i, 0);
            }
            binary = b.toString() + binary;
        }


        String c = String.format("%.2f",num2);


        for (int i = c.length(); i < 10; i++) {
            c = " " + c;
        }


        String d = String.format("%.3f",num3);

        for (int i = d.length(); i < 10; i++) {
            d += " ";
        }
        System.out.printf("|%s|%s|%s|%s|", a.toUpperCase(), binary, c, d);
    }


}
