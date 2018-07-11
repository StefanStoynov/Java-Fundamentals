package p07_CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomList<String> list = new CustomListImpl<>();
        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[]tokens  = line.split("\\s+");

            execute(tokens,list);
            
        }
    }
    public static void execute(String[]commands, CustomList<String>list){
        String command = commands[0];
        switch (command){
            case "Add":
                String element = commands[1];
                list.add(element);
                break;
            case "Remove":
                list.remove(Integer.parseInt(commands[1]));
                break;
            case "Contains":
                System.out.println(list.contains(commands[1]));
                break;
            case "Swap":
                list.swap(Integer.parseInt(commands[1]),Integer.parseInt(commands[2]));
                break;
            case "Greater":
                System.out.println(list.countGreaterThan(commands[1]));
                break;
            case"Max":
                System.out.println(list.getMax());
                break;
            case"Min":
                System.out.println(list.getMin());
                break;
            case"Print":
                for (String e : list.getElements()) {
                    System.out.println(e);
                }
        }
    }
}
