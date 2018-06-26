package p05_BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Controlable> controlables = new LinkedList<>();

        String line;
        while (true) {
            if ("End".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");
            Controlable controlable;
            if (tokens.length == 3) {
                controlable = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            } else {
                controlable = new Robot(tokens[0], tokens[1]);
            }
            controlables.add(controlable);

        }
        String banned = reader.readLine();

        for (Controlable controlable : controlables) {
            if (controlable.getId().endsWith(banned)){
                System.out.println(controlable.getId());
            }
        }
    }
}
