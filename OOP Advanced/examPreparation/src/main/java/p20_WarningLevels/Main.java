package p20_WarningLevels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String restriction = reader.readLine();
        Logger logger = new Logger();
        String line;

        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[]tokens  = line.split(":\\s+");
            String importance = tokens[0];
            String message = tokens[1];

            Message message1 = new Message(importance,message);
            logger.addMessage(message1,restriction);
            
        }


        for (Message message : logger) {
            System.out.println(message);
        }
    }
}
