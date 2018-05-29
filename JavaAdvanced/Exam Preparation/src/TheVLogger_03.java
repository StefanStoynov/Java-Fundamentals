import java.util.*;

public class TheVLogger_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, List<String>>> vlogers = new LinkedHashMap<>();



        String line;
        while (true) {
            if ("Statistics".equals(line = scanner.nextLine())) {
                break;
            }
            String[] input = line.split("\\s+");
            String vlogerName = input[0];
            String command = input[1];


            if ("joined".equals(command)) {
                initializeVlogers(vlogerName,vlogers);
            } else if ("followed".equals(command)) {
                String otherName = input[2];
                if (vlogerName.equals(otherName)) {
                    break;
                    //   } else if (vlogers.get(otherName).get("followers").contains(vlogerName)) {
                    //       break;
                    //   }
                }
                if (vlogers.get(otherName).get().isEmpty()) {
                    vlogers.get(otherName).putIfAbsent("followers", vlogerName);
                } else {
                    vlogers.get(otherName).get("followers").add(otherName);
                    vlogers.get(otherName).put("followers", );
                }
            }
        }

    }

    private static void initializeVlogers(String name,Map<String, Map<String, List<String>>> vlogers) {
        Map<String,List<String>> followers = new LinkedHashMap<>();


        followers.put("followers",new ArrayList<>());
        followers.put("following",new ArrayList<>());
        vlogers.put(name,followers);
    }
}
