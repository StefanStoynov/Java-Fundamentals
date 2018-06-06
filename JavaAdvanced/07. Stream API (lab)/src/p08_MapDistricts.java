import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p08_MapDistricts {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<Integer>> cities = new HashMap<>();


        List<String> tokens = Arrays
                .stream(reader.readLine().split("\\s+"))
                .collect(Collectors.toList());
        int restranes = Integer.parseInt(reader.readLine());

        for (String token : tokens) {
            String[] input = token.split(":");
            String district = input[0];
            int population = Integer.parseInt(input[1]);
            List<Integer> districtPopulation = new LinkedList<>();
            if (!cities.containsKey(district)) {
                cities.put(district, districtPopulation);
            }
            cities.get(district).add(population);
        }
        cities
                .entrySet()
                .stream()
                .filter(filterByPopulation(restranes))
                .sorted(sortByPopulation())
                .forEach(print());

    }

    private static Predicate<Map.Entry<String, List<Integer>>> filterByPopulation(int restranes) {
        return kv -> kv.getValue().stream().mapToInt(Integer::valueOf).sum() >= restranes;
    }

    private static Comparator<Map.Entry<String, List<Integer>>> sortByPopulation() {
        return (kv1, kv2) -> Integer.compare(
                kv2.getValue().stream().mapToInt(Integer::intValue).sum(),
                kv1.getValue().stream().mapToInt(Integer::intValue).sum()
        );
    }

    private static Consumer<Map.Entry<String, List<Integer>>> print() {
        return kv -> {
            System.out.print(kv.getKey() + ": ");
            kv.getValue().stream()
                    .sorted((x1, x2) -> x2.compareTo(x1))
                    .limit(5).forEach(dp -> System.out.print(dp + " "));
            System.out.println();
        };


    }
}
