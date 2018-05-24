import java.util.*;

public class UserLogs_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> users = new TreeMap<>();


        String line;
        while (true) {
            if ("end".equals(line = scanner.nextLine())) {
                break;
            }
            String[] input = line.split("\\s+");

            String[] nameRow = input[2].split("=");
            String name = nameRow[1];

            String[] ipRow = input[0].split("=");
            String ip = ipRow[1];
            Map<String, Integer> ipData = new LinkedHashMap<>();
            if (!users.containsKey(name)) {

                ipData.put(ip, 0);
                users.put(name, ipData);
            }
            if (users.get(name).containsKey(ip)) {
                int countUpdate = users.get(name).get(ip) + 1;
                users.get(name).put(ip, countUpdate);
            } else {

                users.get(name).put(ip, 1);
            }

        }
        for (Map.Entry<String, Map<String, Integer>> user : users.entrySet()) {
            System.out.println(user.getKey() + ": ");

            for (Map.Entry<String,Integer> e: user.getValue().entrySet()) {
                System.out.printf("%s => %d,%n",e.getKey(),e.getValue());
            }
        }
    }
}
