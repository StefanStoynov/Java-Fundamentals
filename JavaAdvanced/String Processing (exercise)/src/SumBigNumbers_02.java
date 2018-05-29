import java.util.Scanner;

public class SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longNum = scanner.nextLine();
        String shortNum = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        if (shortNum.length()>longNum.length()){
            String temp = "";
            longNum = shortNum;
            shortNum = temp;
        }
        int longNumIndex = longNum.length();
        int expand = 0;
        for (int i = shortNum.length(); i > 0; i--, longNumIndex --) {
            int firstNumber = longNum.charAt(i)-'0';
            int secondNumber = shortNum.charAt(i-1)-'0';
        }
    }
}
