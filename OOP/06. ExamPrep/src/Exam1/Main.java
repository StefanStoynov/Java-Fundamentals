package Exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HealthManager healthManager = new HealthManager();
        System.out.println(healthManager.createOrganism("ivo"));
        System.out.println(healthManager.addCluster("ivo", "sss", 2, 3));
        System.out.println(healthManager.addCluster("ivo", "sss", 2, 3));
        System.out.println(healthManager.addCluster("ivo", "ass", 2, 3));
        System.out.println(healthManager.addCell("ivo", "sss", "Virus", "WBC", 20, 0, 0, 20));
        System.out.println();
    }

}
