package Exam2;

import Exam2.Colonist.Colonist;
import Exam2.Colonist.SoftwareEngineer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] max = reader.readLine().split("\\s+");
        int maxFamilyCount = Integer.parseInt(max[0]);
        int maxFamilyCapacity = Integer.parseInt(max[1]);

        Colony colony = new Colony(maxFamilyCount, maxFamilyCapacity);

        String line;
        while (true) {
            if ("end".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "insert":
                    if (colony.getMaxFamilyCapacity() > 0) {
                        String clazz = tokens[1];
                        String colonistId = tokens[2];
                        String familyId = tokens[3];
                        int talent = Integer.parseInt(tokens[4]);
                        int age = Integer.parseInt(tokens[5]);

                        Colonist colonist = null;
                        Family family = null;
                        switch (clazz) {
                            case "SoftwareEngineer":
                                //colonist = new SoftwareEngineer(clazz, colonistId, familyId, talent, age);
                                break;
                            case "HardwareEngineer":
                                break;
                            case "Soldier":
                                break;
                            case "GeneralPractitioner":
                                break;
                            case "Surgeon":
                                break;
                        }
                        if (!colony.getFamilies().containsKey(familyId)) {
                            family = new Family(familyId);
                            colony.addFamily(familyId, family);
                            family.addMember(colonist);
                        } else {
                            if (maxFamilyCapacity > family.getFamilyMembers().size()) {
                                family.addMember(colonist);
                            } else {
                                break;
                            }
                        }
                        colony.setMaxFamilyCapacity(colony.getMaxFamilyCapacity() - 1);
                    } else {
                        break;
                    }
                    break;
            }

        }

    }
}
