import java.util.Scanner;

public class SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longNum = trimmingLeadingZeros(scanner.nextLine());
        String shortNum = trimmingLeadingZeros(scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        if (shortNum.length() > longNum.length()) {
            String temp = longNum;
            longNum = shortNum;
            shortNum = temp;
        }
        int longNumIndex = longNum.length();
        int expand = 0;
        int numToEnter = 0;
        int sum = 0;
        for (int i = 0; i < shortNum.length(); i++, longNumIndex--) {
            int a = longNum.charAt(longNum.length() - 1 - i) - '0';
            int b = shortNum.charAt(shortNum.length() - 1 - i) - '0';

            sum = expand + a + b;
            expand = 0;
            numToEnter = sum % 10;
            sb.append(numToEnter);

            if (sum >= 10) {

                expand++;
            }
            sum = 0;
        }
        for (int i = 0; i < longNumIndex; i++) {
            int a = longNum.charAt(longNumIndex - 1 - i) - '0';
            sum = expand + a;
            expand = 0;

            numToEnter = sum % 10;
            sb.append(numToEnter);

            if (sum >= 10) {

                expand++;
            }
            sum = 0;

        }
        if (expand > 0) {
            sb.append(expand);
        }
        System.out.println(sb.reverse());
    }
    private static String trimmingLeadingZeros(String number){
        int counter = 0;
        for (int i = 0; i <number.length() ; i++) {
            if (number.charAt(i)!='0'){
                break;
            }
            counter++;
        }
        return number.substring(counter);
    }
}
