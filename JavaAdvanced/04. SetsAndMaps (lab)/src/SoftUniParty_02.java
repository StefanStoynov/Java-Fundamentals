import java.util.*;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Set<String> people = new TreeSet<>();

        while (!"PARTY".equals(line)){
            people.add(line);
            line = scanner.nextLine();
        }

        while (!"END".equals(line)){
            people.remove(line);
            line = scanner.nextLine();
        }

        System.out.println(people.size());
        for (String person : people) {
            System.out.println(person);
        }
    }
}
