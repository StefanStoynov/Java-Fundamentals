import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class p07_PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int nameLenght = Integer.parseInt(reader.readLine());
        String[]names = reader.readLine().split("\\s+");

        Predicate<String> isValidName = a -> {
            if (a.length()<=nameLenght){
                return true;
            }
            return false;
        };

        for (String name : names) {
            if(isValidName.test(name)){
                System.out.println(name);
            }
        }
    }
}
