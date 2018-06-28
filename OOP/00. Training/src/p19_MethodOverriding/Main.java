package p19_MethodOverriding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Rectangle> shapes= new LinkedList<>();
        int numberOfShapes = Integer.parseInt(reader.readLine());

        while (numberOfShapes-->0){
            double[]sides = Arrays.stream(reader.readLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            if (sides.length==1){
                Rectangle square = new Square(sides[0],sides[0]);
                shapes.add(square);
            }else{
                Rectangle rectangle = new Rectangle(sides[0],sides[1]);
                shapes.add(rectangle);
            }
        }
        for (Rectangle shape : shapes) {
            System.out.println(shape.area());
        }
    }
}
