import java.util.Scanner;

public class StudentsResults_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("[, -]+");
        String name = input[0];
        double sum = Double.parseDouble(input[1]) + Double.parseDouble(input[2]) + Double.parseDouble(input[3]);
        double average = sum / 3;
        System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|", "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"));
        System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|"
                , name
                , Double.parseDouble(input[1])
                , Double.parseDouble(input[2])
                , Double.parseDouble(input[3])
                , average));
    }
}