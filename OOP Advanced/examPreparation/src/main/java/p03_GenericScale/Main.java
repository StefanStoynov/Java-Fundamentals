package p03_GenericScale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scale scale = new Scale(1,2);
        System.out.println(scale.getHeavier());
        Scale scale1 = new Scale("aa","ab");
        System.out.println(scale1.getHeavier());
    }
}
