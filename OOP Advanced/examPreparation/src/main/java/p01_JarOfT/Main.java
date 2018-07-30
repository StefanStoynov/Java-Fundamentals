package p01_JarOfT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Jar jar = new Jar();
        jar.add("gosho");
        jar.add("ii");
        jar.add("ss");
        jar.add("aaa");
        for (Object o : jar) {
            System.out.println(o);
        }
        System.out.println(jar.remove());
    }
}
