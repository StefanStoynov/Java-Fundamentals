package Exam3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FireNation fireNation = new FireNation();
        EarthNation earthNation = new EarthNation();
        WaterNation waterNation = new WaterNation();
        AirNation airNation = new AirNation();
        List<String> wars = new LinkedList<>();
        Map<String, Double> winer = new LinkedHashMap<>();

        String line;
        while (true) {
            if ("Quit".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");

            switch (tokens[0]) {
                case "Bender":
                    String benderType = tokens[1];
                    String benderName = tokens[2];
                    int benderPower = Integer.parseInt(tokens[3]);
                    switch (benderType) {
                        case "Fire":
                            double heatAggression = Double.parseDouble(tokens[4]);
                            FireBender fireBender = new FireBender(benderName, benderPower, heatAggression);
                            fireNation.addFireBender(fireBender);
                            break;
                        case "Air":
                            double aerialIntegrity = Double.parseDouble(tokens[4]);
                            AirBender airBender = new AirBender(benderName, benderPower, aerialIntegrity);
                            airNation.addAirBender(airBender);
                            break;
                        case "Earth":
                            double groundSaturation = Double.parseDouble(tokens[4]);
                            EarthBender earthBender = new EarthBender(benderName, benderPower, groundSaturation);
                            earthNation.addEarthBender(earthBender);
                            break;
                        case "Water":
                            double waterClarity = Double.parseDouble(tokens[4]);
                            WaterBender waterBender = new WaterBender(benderName, benderPower, waterClarity);
                            waterNation.addWaterBender(waterBender);
                            break;
                    }
                    break;
                case "Monument":
                    String monumentType = tokens[1];
                    String monumetName = tokens[2];
                    switch (monumentType) {
                        case "Fire":
                            int fireAffinity = Integer.parseInt(tokens[3]);
                            FireMonument fireMonument = new FireMonument(monumetName, fireAffinity);
                            fireNation.addFireMonument(fireMonument);
                            break;
                        case "Air":
                            int airAffinity = Integer.parseInt(tokens[3]);
                            AirMonument airMonument = new AirMonument(monumetName, airAffinity);
                            airNation.addAirMonuments(airMonument);
                            break;
                        case "Earth":
                            int earthAffinity = Integer.parseInt(tokens[3]);
                            EarthMonument earthMonument = new EarthMonument(monumetName, earthAffinity);
                            earthNation.addEarthMonument(earthMonument);
                            break;
                        case "Water":
                            int waterAffinity = Integer.parseInt(tokens[3]);
                            WaterMonument waterMonument = new WaterMonument(monumetName, waterAffinity);
                            waterNation.addWaterMonument(waterMonument);
                            break;
                    }

                    break;
                case "Status":
                    String nation = tokens[1];
                    switch (nation) {
                        case "Fire":
                            System.out.println(fireNation.toString());
                            break;
                        case "Air":
                            System.out.println(airNation.toString());
                            break;
                        case "Earth":
                            System.out.println(earthNation.toString());
                            break;
                        case "Water":
                            System.out.println(waterNation.toString());
                            break;
                    }
                    break;
                case "War":
                    String startWarNation = tokens[1];
                    wars.add(startWarNation);
                    winer.put("WaterNation", waterNation.waterNationPower());
                    winer.put("FireNation", fireNation.fireNationPower());
                    winer.put("AirNation", airNation.airNationPower());
                    winer.put("EarthNation", earthNation.earthNationPower());
                    Double winner = Double.MIN_VALUE;
                    String country = "";
                    for (Map.Entry<String, Double> nationPower : winer.entrySet()) {
                        if (nationPower.getValue() > winner) {
                            winner = nationPower.getValue();
                            country = nationPower.getKey();
                        }

                    }

                    if (!FireNation.class.getName().endsWith(country)) {
                        fireNation.getFireBenders().clear();
                        fireNation.getFireMonuments().clear();
                    }
                    if (!AirNation.class.getName().endsWith(country)) {
                        airNation.getAirBenders().clear();
                        airNation.getAirMonuments().clear();
                    }
                    if (!EarthNation.class.getName().endsWith(country)) {
                        earthNation.getEarthBenders().clear();
                        earthNation.getEarthMonuments().clear();
                    }
                    if (!WaterNation.class.getName().endsWith(country)) {
                        waterNation.getWaterBenders().clear();
                        waterNation.getWaterMonuments().clear();
                    }
                    break;

            }

        }
        for (int i = 1; i <=wars.size() ; i++) {
            System.out.println(String.format("War %d issued by %s",i,wars.get(i-1)));
        }
    }
}
