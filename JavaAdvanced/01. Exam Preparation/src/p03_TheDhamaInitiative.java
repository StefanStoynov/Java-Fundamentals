import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class p03_TheDhamaInitiative {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> dharmaStations = new HashMap<>();
        dharmaStations.putIfAbsent("Hydra", "Zoological Research.");
        dharmaStations.putIfAbsent("Arrow", "Development of defensive strategies, and Intelligence gathering.");
        dharmaStations.putIfAbsent("Flame", "Communication.");
        dharmaStations.putIfAbsent("Pearl", "Psychological Research and/or Observation.");
        dharmaStations.putIfAbsent("Orchid", "Space-time manipulation research, disguised as a Botanical station.");

        Map<String, Map<String, String>> stationsRecrutes = new LinkedHashMap<>();
        stationsRecrutes.put("Hydra", new LinkedHashMap<>());
        stationsRecrutes.put("Arrow", new LinkedHashMap<>());
        stationsRecrutes.put("Flame", new LinkedHashMap<>());
        stationsRecrutes.put("Pearl", new LinkedHashMap<>());
        stationsRecrutes.put("Orchid", new LinkedHashMap<>());
        String line;
        while (true) {
            if ("Recruit".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split(":");
            String recrutName = tokens[0];
            String idNumber = tokens[1];
            String facility = tokens[2];
            if (!dharmaStations.containsKey(facility)) {
                continue;
            }
            stationsRecrutes.get(facility).putIfAbsent(idNumber, recrutName);
            System.out.println();
        }
        String line2 = reader.readLine();
        if ("DHARMA Initiative".equals(line2)) {
            stationsRecrutes.entrySet().stream().sorted((x1, x2) -> {
                int x1Size = x1.getValue().values().size();
                int x2Size = x2.getValue().values().size();

                int comparatorBySize = x2Size - x1Size;
                if (comparatorBySize != 0) {
                    return comparatorBySize;
                } else {
                    return x1.getKey().compareTo(x2.getKey());

                }
            }).forEach(x -> System.out.println(String.format("The %s has %d DHARMA recruits in it.", x.getKey(), x.getValue().size())));
        } else {
            if (!dharmaStations.containsKey(line2)) {
                System.out.println("DHARMA Initiative does not have such a station!");
            }
            else if(stationsRecrutes.get(line2).values().size()==0){
                System.out.println(String.format("The %s station: %s%nNo recruits.",line2,dharmaStations.get(line2)));
            } else {
                System.out.println(String.format("The %s station: %s", line2, dharmaStations.get(line2)));
                stationsRecrutes.get(line2).entrySet().stream().sorted((x1, x2) -> x2.getKey().compareTo(x1.getKey()))
                        .forEach(x -> System.out.println(String.format("###%s - %s", x.getValue(), x.getKey())));
            }

        }
    }
}
