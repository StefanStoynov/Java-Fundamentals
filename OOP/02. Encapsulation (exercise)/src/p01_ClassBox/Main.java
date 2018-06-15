package p01_ClassBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double lenght = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());


        System.out.printf("Surface Area - %.2f%n",Box.SurfaceArea(lenght,height,width));
        System.out.printf("Lateral Surface Area - %.2f%n",Box.LateralSurface(lenght,height,width));
        System.out.printf("Volume - %.2f%n",Box.Volume(lenght,height,width));
    }
}
