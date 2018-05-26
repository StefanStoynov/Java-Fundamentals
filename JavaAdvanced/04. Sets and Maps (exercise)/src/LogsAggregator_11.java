import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LogsAggregator_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfUsers = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, Integer>> usersData = new TreeMap<>();

        for (int i = 0; i < numberOfUsers; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String ip = input[0];
            String user = input[1];
            int timeInSeconds = Integer.parseInt(input[2]);
            usersData.putIfAbsent(user, new TreeMap<>());
            usersData.get(user).putIfAbsent(ip, 0);
            usersData.get(user).put(ip, usersData.get(user).get(ip) + timeInSeconds);

        }
        usersData.forEach((key,value) ->
                System.out.printf("%s: %d [%s]%n",key, value.values()
                        .stream()
                        .mapToInt(Integer::intValue)
                        .sum(),
                        String.join(", ",value.keySet()))
        );
    }
}
