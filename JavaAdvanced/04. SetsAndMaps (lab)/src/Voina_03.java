import java.util.*;

public class Voina_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]firstPlayer = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[]secondPlayer = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        Set<Integer>firstPlayerCards = new LinkedHashSet<>();
        Set<Integer>secondPlayerCards = new LinkedHashSet<>();

        for (int i = 0; i < 20; i++) {
            firstPlayerCards.add(firstPlayer[i]);
            secondPlayerCards.add(secondPlayer[i]);
        }
        for (int i = 0; i < 50; i++) {
            if (firstPlayerCards.isEmpty()|| secondPlayerCards.isEmpty()){
                return;
            }
            int firstCard = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstCard);
            int secondCard = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondCard);

            if (firstCard>secondCard){
                firstPlayerCards.add(firstCard);
                firstPlayerCards.add(secondCard);
            }else if(firstCard<secondCard){
                secondPlayerCards.add(firstCard);
                secondPlayerCards.add(secondCard);
            }
        }

        if (firstPlayerCards.size()>secondPlayerCards.size()){
            System.out.println("First player win!");
        }else if (firstPlayerCards.size()<secondPlayerCards.size()){
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }


    }
}
