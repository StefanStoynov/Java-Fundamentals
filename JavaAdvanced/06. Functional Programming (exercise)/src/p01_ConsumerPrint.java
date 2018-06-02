import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class p01_ConsumerPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] names = reader.readLine().split("\\s+");

        for (int i = 0; i < names.length; i++) {
            Consumer<String> printName = name -> System.out.println(name);
            printName.accept(names[i]);
        }
    }
}
