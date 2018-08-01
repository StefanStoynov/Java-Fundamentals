package p14_CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomList<String> myList = new MyList<>();
        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            System.out.println();
            String[]tokens  = line.split("\\s+");
            try {
                switch (tokens[0]) {
                    case "Add":
                        myList.add(tokens[1]);
                        break;
                    case "Remove":
                        myList.remove(tokens[1]);
                        break;
                    case "Contains":
                        System.out.println(myList.containce(tokens[1]));
                        break;
                    case "Swap":
                        myList.swap(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
                        break;
                    case "Max":
                        System.out.println(myList.getMax());
                        break;
                    case "Min":
                        System.out.println(myList.getMin());
                        break;
                    case "Print":
                        System.out.println(myList.toString());
                        break;
                    case"Greater":
                        System.out.println(myList.countGreaterThan(tokens[1]));
                        break;
                }
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }
    }
}
