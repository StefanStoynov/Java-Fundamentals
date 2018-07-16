package p01_ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ListyIterator listyIterator = null;

        String line;

        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] input = line.split("\\s+", 2);

            switch (input[0]) {
                case "Create":
                    if (input.length>1){
                        String[]args1 = input[1].split("\\s+");
                        listyIterator = new ListyIterator(args1);
                    }else{
                        listyIterator = new ListyIterator();
                    }

                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
            }


        }
    }
}
