import java.util.*;


public class LegendaryFarming_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;

        Map<String, Integer> legendaryMetals = new TreeMap<>();
        Map<String, Integer> junk = new TreeMap<>();
        String legendaryMetal = "";
        legendaryMetals.put("shards", 0);
        legendaryMetals.put("fragments", 0);
        legendaryMetals.put("motes", 0);
        while (legendaryMetal.isEmpty()) {
            if ((line = scanner.nextLine()).isEmpty()) {
                break;
            }
            String[] materials = line.split("\\s+");

            for (int i = 0; i < materials.length; i += 2) {
                String metal = materials[i + 1].toLowerCase();
                int quantity = Integer.parseInt(materials[i]);


                if ("shards".equals(metal) || "fragments".equals(metal) || "motes".equals(metal)) {
                    legendaryMetals.putIfAbsent(metal, 0);
                    legendaryMetals.put(metal, legendaryMetals.get(metal) + quantity);
                    if (legendaryMetals.get(metal) >= 250) {

                        legendaryMetal = metal;
                        printResult(metal, legendaryMetals, junk);
                        break;

                    }
                } else {
                    junk.putIfAbsent(metal, 0);
                    junk.put(metal, junk.get(metal) + quantity);
                }
            }


        }

    }

    private static void printResult(String metal, Map<String, Integer> legendaryMetals, Map<String, Integer> junk) {
        String item = "";
        switch (metal) {
            case "shards":
                item = "Shadowmourne";
                break;
            case "fragments":
                item = "Valanyr";
                break;
            case "motes":
                item = "Dragonwrath";
                break;
        }
        System.out.println(item + " obtained!");
       legendaryMetals.replace(metal, legendaryMetals.get(metal) - 250);
        legendaryMetals.entrySet()
                .stream()
                .sorted((x, y) -> -x.getValue().compareTo(y.getValue()))
                .forEach(x -> System.out.printf("%s: %s%n", x.getKey(), x.getValue()));
        junk.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));
    }
}
