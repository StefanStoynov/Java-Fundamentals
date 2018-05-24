import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PopulationCounter_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Long>> countryData = new LinkedHashMap<>();
        String line;

        while (true) {
            if ("report".equals(line = scanner.nextLine())) {
                break;
            }
            String[] input = line.split("\\|");

            String country = input[1];
            String city = input[0];
            long count = Long.parseLong(input[2]);

            Map<String, Long> cityData = new LinkedHashMap<>();

            if (!countryData.containsKey(country)) {
                cityData.put(city, count);
                countryData.put(country, cityData);
            } else {

                countryData.get(country).put(city, count);
            }
        }
        Map<String, Map<String, Long>> sortedCountries = countryData
                .entrySet()
                .stream()
                .sorted((country1, country2) -> {
                    long populationCountry1 = country1.getValue().values().stream().mapToLong(Long::valueOf).sum();
                    long populationCountry2 = country2.getValue().values().stream().mapToLong(Long::valueOf).sum();
                    int comparator = Long.compare(populationCountry2, populationCountry1);
                    return comparator;
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        for (Map.Entry<String, Map<String, Long>> country : sortedCountries.entrySet()) {
            String citiesResult = "";
            long totalPopulation = 0;
            Map<String, Long> cities = country.getValue();
            Map<String, Long> sortedCities = cities
                    .entrySet()
                    .stream()
                    .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
            for (Map.Entry<String, Long> city : sortedCities.entrySet()) {

                citiesResult += "=>" + city.getKey() + ": " + city.getValue() + "\n";
                totalPopulation +=city.getValue();
            }
            System.out.printf("%s (total population: %d)%n",country.getKey(),totalPopulation);
            System.out.print(citiesResult);
        }

    }
}
