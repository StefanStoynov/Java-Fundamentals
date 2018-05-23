import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;
        Map<String, Integer> metals = new LinkedHashMap<>();
        while (true) {
            if ("stop".equals(line = scanner.nextLine())) {
                break;
            }
            String metal = line;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!metals.containsKey(metal)) {
                metals.put(metal, 0);
            }
            int sumquantity = quantity + metals.get(metal);
            metals.put(metal, sumquantity);
        }
        for (Map.Entry<String, Integer> metal : metals.entrySet()) {
            System.out.printf("%s -> %d%n",metal.getKey(),metal.getValue());
        }

    }
}
