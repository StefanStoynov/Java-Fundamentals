package Java_Advanced.Intro_to_Java;

import java.util.Scanner;

public class ModifyABit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberInput = scanner.nextInt();
        int position =scanner.nextInt();
        int valueInput = scanner.nextInt();

        int result = 0;


        boolean retry = true;

        while (retry)
        {
            retry = false;
            if (valueInput == 0)
            {
                int mask = ~(1 << position);
                result = numberInput & mask;
                break;
            }
            else if (valueInput == 1)
            {
                int mask = 1 << position;
                result = numberInput | mask;
                break;
            }
            else
            {
                System.out.printf("You have to enter value 0 or 1:");
                valueInput = Integer.parseInt(scanner.nextLine());
                retry = true;
            }
        }

        System.out.println(result);
    }
}
