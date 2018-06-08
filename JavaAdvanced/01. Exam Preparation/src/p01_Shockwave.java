import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p01_Shockwave {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] cards = reader.readLine().split("\\s+");
        int sum1 = 0;
        int sum = 0;
        char suit = '\0';
        char suit1 = '\0';
        int number = 0;
        int counter = 1;
        for (int i = 0; i < cards.length ; i++) {


            if (cards[i].length() > 2) {
                suit1 = cards[i].charAt(2);
                number = 10;
            } else {
                suit1 = cards[i].charAt(1);
                try {
                    number = Integer.parseInt("" + cards[i].charAt(0));
                } catch (Exception e) {
                    switch (cards[i].charAt(0)) {
                        case 'J':
                            number = 12;
                            break;
                        case 'Q':
                            number = 13;
                            break;
                        case 'K':
                            number = 14;
                            break;
                        case 'A':
                            number = 15;
                            break;
                    }
                }
            }
            if (i == 0) {
                suit = suit1;
                sum1 = number;
            } else {
                if (suit == suit1) {
                    counter++;
                    sum1 += number;
                } else {
                    sum += (sum1 * counter);
                    counter = 1;
                    sum1 = number;
                    suit = suit1;
                }
            }
            if (i==cards.length-1){
                sum+=sum1*counter;
            }


        }
        System.out.println(sum);
    }
}
