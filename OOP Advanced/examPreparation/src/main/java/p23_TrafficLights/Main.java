package p23_TrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<TraficLight> traficLights = new ArrayList<>();
        String[] lights = reader.readLine().split("\\s+");
        System.out.println();
        for (String light : lights) {
            traficLights.add(new TraficLight(light));
        }

        int rotations = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        while (rotations-- > 0) {
            for (TraficLight traficLight : traficLights) {
                traficLight.changeLight();
                sb.append(traficLight).append(" ");
            }
            sb.append(System.lineSeparator());
        }

        System.out.println(sb.toString());
    }
}
