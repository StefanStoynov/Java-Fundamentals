package p12_FirstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Team team = new Team();
        int numberOfPeople = Integer.parseInt(reader.readLine());

        while (numberOfPeople-- > 0) {

            String[] perosnTokens = reader.readLine().split("\\s+");
            String firstName = perosnTokens[0];
            String lastName = perosnTokens[1];
            int age = Integer.parseInt(perosnTokens[2]);
            double salary = Double.parseDouble(perosnTokens[3]);
            try {
                Person person = new Person(firstName, lastName, age, salary);
                team.addPlayer(person);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getSecondTeam().size() + " players");

    }
}
