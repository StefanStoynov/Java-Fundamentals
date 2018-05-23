import java.util.*;

public class HandsOfCards_08 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> player = new LinkedHashMap<>();

        Map<String, Integer> types = new LinkedHashMap<>();
        types.put("S", 4);
        types.put("H", 3);
        types.put("D", 2);
        types.put("C", 1);
        Map<String, Integer> powers = new LinkedHashMap<>();
        powers.put("J", 11);
        powers.put("Q", 12);
        powers.put("K", 13);
        powers.put("A", 14);

        String line;
        while (!"JOKER".equals(line = scanner.nextLine())) {
            String[] input = line.split(":\\s");

            String name = input[0];
            String[] cards = input[1].split(",\\s");

            Set<String> allCards = new HashSet<>();

            Collections.addAll(allCards, cards);

            if (!player.containsKey(name)) {

                player.put(name, allCards);

            }
            Set<String> previousCards = player.get(name);
            previousCards.addAll(allCards);

        }
        for (Map.Entry<String, Set<String>> players : player.entrySet()) {
            int totalCardStrenght = 0;
            for (String card : players.getValue()) {
                String power = card.substring(0, card.length() - 1);
                String type = String.valueOf(card.charAt(card.length() - 1));
                totalCardStrenght += powerOfCard(power,type,powers,types);
            }
            System.out.printf("%s: %d%n",players.getKey(),totalCardStrenght);
        }
    }

    private static int powerOfCard(String power, String type, Map<String, Integer> powers, Map<String, Integer> types) {

        int cardPower ;
        try {
           cardPower = Integer.parseInt(power);
        } catch (NumberFormatException nfe) {
            cardPower= powers.get(power);
        }
        return cardPower*types.get(type);
    }
}
