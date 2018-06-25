package p14_ClassBoxDataValidation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(reader.readLine());
        double width  = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());
        try {
            Box box = new Box(length, width, height);
            System.out.println(String.format("Surface Area - %.2f", box.surfaceArea()));
            System.out.println(String.format("Lateral Surface Area - %.2f", box.lateralSurfaceArea()));
            System.out.println(String.format("Volume - %.2f", box.volume()));
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
