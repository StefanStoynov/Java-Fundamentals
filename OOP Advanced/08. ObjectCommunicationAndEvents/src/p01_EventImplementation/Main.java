package p01_EventImplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Dispatcher dispatcher = new Dispatcher();

        Handler handler = new Handler();

        dispatcher.addNameChangeListener(handler);

        String line;
        while (true) {
            if ("".equals(line = reader.readLine())) {
                break;
            }
            String[]  = line.split("\\s+");

            
        }
    }
}
