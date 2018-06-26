package p04_Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] phoneTokens = reader.readLine().split("\\s+");
        String[] webTokens = reader.readLine().split("\\s+");
        Smartphone smartphone = new Smartphone();
        for (String phone : phoneTokens) {
            System.out.println(smartphone.call(phone));
        }
        for (String url : webTokens) {
            System.out.println(smartphone.browse(url));
        }
    }
}
