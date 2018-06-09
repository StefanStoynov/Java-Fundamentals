import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p04_FootballStats {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> matchesHome = new LinkedHashMap<>();
        Map<String, List<String>> matchesGuest = new LinkedHashMap<>();

        String line;
        while (true) {
            if ("Season End".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("[\\s\\-:]+");

            String homeTeam = tokens[0];
            String guestTeam = tokens[1];
            String scoreHomeTeam = tokens[3];
            String scoreGuestTeam = tokens[4];

            matchesHome.putIfAbsent(homeTeam, new LinkedList<>());
            matchesHome.putIfAbsent(guestTeam, new LinkedList<>());
            matchesHome.get(homeTeam).add(" - " + guestTeam + " -> " + scoreHomeTeam + ":" + scoreGuestTeam);
            matchesHome.get(guestTeam).add(" - " + homeTeam + " -> " + scoreGuestTeam + ":" + scoreHomeTeam);

            matchesGuest.putIfAbsent(guestTeam,new LinkedList<>());
            matchesGuest.putIfAbsent(homeTeam,new LinkedList<>());
            matchesGuest.get(homeTeam).add(" - " + guestTeam + " -> " + scoreHomeTeam + ":" + scoreGuestTeam);
            matchesGuest.get(guestTeam).add(" - " + homeTeam + " -> " + scoreGuestTeam + ":" + scoreHomeTeam);



        }
        String[]surchedTeams = reader.readLine().split(", ");

        for (String surchedTeam : surchedTeams) {
              if (matchesHome.containsKey(surchedTeam)){
                  matchesHome
                          .get(surchedTeam)
                          .stream()
                          .sorted(Comparator.comparing(x -> x.split(" -> ")[0])) // $Atletico$ -> 3:0
                          .forEach(s-> System.out.println(surchedTeam+""+s));
              }
        }


    }


}
