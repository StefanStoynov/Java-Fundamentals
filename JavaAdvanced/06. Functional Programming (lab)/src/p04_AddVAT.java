import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class p04_AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double[] prices = Arrays.stream(reader.readLine().split(", ")).mapToDouble(Double::parseDouble).toArray();

        Function<double[], List<Double>> addVat = x -> {
            List<Double> vatPriecs = new LinkedList<>();
            for (double price : x) {
                vatPriecs.add(price * 1.2);
            }
            return vatPriecs;
        };
        System.out.println("Prices with VAT:");
        addVat.apply(prices).forEach(x-> System.out.println(String.format("%.2f",x)));
    }
}
