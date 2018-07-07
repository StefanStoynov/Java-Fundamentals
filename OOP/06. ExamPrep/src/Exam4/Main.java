package Exam4;

import Exam4.colonist.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.SwitchPoint;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] colonyCapacities = reader.readLine().split("\\s+");
        int familyCount = Integer.parseInt(colonyCapacities[0]);
        int familyCapacity = Integer.parseInt(colonyCapacities[1]);
        Colony colony = new Colony(familyCount, familyCapacity);

        String line;
        while (true) {
            if ("end".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "insert":
                    String clazz = tokens[1];
                    String colonistId = tokens[2];
                    String familyId = tokens[3];
                    int talent = Integer.parseInt(tokens[4]);
                    int age = Integer.parseInt(tokens[5]);
                    switch (clazz) {
                        case "Soldier":
                            Colonist soldier = new Soldier(colonistId, familyId, talent, age);
                            try {
                                colony.addColonist(soldier);
                            }catch (IllegalArgumentException iae){
                                System.out.println(iae.getMessage());
                            }
                            break;
                        case "SoftwareEngineer":
                            Colonist softwareEngineer = new SoftwareEngineer(colonistId, familyId, talent, age);
                            try {
                                colony.addColonist(softwareEngineer);
                            }catch (IllegalArgumentException iae){
                                System.out.println(iae.getMessage());
                            }
                            break;
                        case "HardwareEngineer":
                            Colonist hardwareEngineer = new HardwareEngineer(colonistId, familyId, talent, age);
                            try {
                                colony.addColonist(hardwareEngineer);
                            }catch (IllegalArgumentException iae){
                                System.out.println(iae.getMessage());
                            }
                            break;
                        case "GeneralPractitioner":
                            String sign = tokens[6];
                            Colonist generalPractitioner = new GeneralPractitioner(colonistId, familyId, talent, age, sign);
                            try {
                                colony.addColonist(generalPractitioner);
                            }catch (IllegalArgumentException iae){
                                System.out.println(iae.getMessage());
                            }
                            break;
                        case "Surgeon":
                            String signSurgeon = tokens[6];
                            Colonist surgeon = new Surgeon(colonistId, familyId, talent, age, signSurgeon);
                            try {
                                colony.addColonist(surgeon);
                            }catch (IllegalArgumentException iae){
                                System.out.println(iae.getMessage());
                            }
                            break;
                    }
                    break;
                case "remove":
                    String modificator = tokens[1];
                    String familyIdRemove = tokens[2];
                    switch (modificator){
                        case"colonist":
                            String colonistIdRmove = tokens[3];
                            colony.removeColonist(familyIdRemove,colonistIdRmove);
                            break;
                        case "family":
                            colony.removeFamily(familyIdRemove);
                            break;
                    }
                    break;
                case "grow":
                    int yearsGrow = Integer.parseInt(tokens[1]);
                    colony.grow(yearsGrow);
                    break;
                case "potential":
                    System.out.println(String.format("potential: %d",colony.getPotential()));
                    break;
                case "capacity":
                    System.out.println(colony.getCapacity());
                    break;
                case "family":
                    String familiId = tokens[1];
                    if (!colony.getFamilies().containsKey(familiId)){
                        System.out.println("family does not exist");
                    }else{
                        System.out.println(colony.getFamilies().get(familiId).toString());
                    }
                    break;
            }


        }

    }
}
