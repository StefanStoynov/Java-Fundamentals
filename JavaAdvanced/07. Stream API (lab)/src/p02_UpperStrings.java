import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.Arrays;

public class p02_UpperStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] names = reader.readLine().split(" ");

        Arrays.stream(names).map(x-> x.toUpperCase()).forEach(x-> System.out.print(x+" "));


    }
}
