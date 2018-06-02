import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLSyntaxErrorException;
import java.util.function.Consumer;

public class p02_KnightsOfHonor {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[]names = reader.readLine().split("\\s+");
        Consumer<String> addSir = name -> System.out.println("Sir " + name);
        for (int i = 0; i < names.length; i++) {
            addSir.accept(names[i]);
        }
    }
}
