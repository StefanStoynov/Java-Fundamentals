package p24_InfernoInfinity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Weapon> weapons = new HashMap<>();
        System.out.println();
        for (String line = reader.readLine(); !line.equals("END"); line = reader.readLine()) {
            String[] tokens = line.split(";");
            String command = tokens[0];
            switch (command) {
                case "Create":
                    String type = tokens[1];
                    String name = tokens[2];
                    Weapon weapon = new Weapon(name, type);
                    weapons.put(name, weapon);
                    break;
                case "Add":
                    name = tokens[1];
                    int socketIndex = Integer.parseInt(tokens[2]);
                    String gemType = tokens[3];
                    weapon = weapons.get(name);
                    weapon.addGem(gemType, socketIndex);
                    break;
                case "Remove":
                    name = tokens[1];
                    socketIndex = Integer.parseInt(tokens[2]);
                    weapon = weapons.get(name);
                    weapon.removeGem(socketIndex);
                    break;
                case "Print":
                    name = tokens[1];
                    weapon = weapons.get(name);
                    System.out.println(weapon);
                    break;


            }
        }
    }
}