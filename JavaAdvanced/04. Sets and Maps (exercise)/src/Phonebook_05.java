import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contacts = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (true) {
            if ("search".equals(line)) {
                break;
            }
            String[] contactInfo = line.split("-");
            String name = contactInfo[0];
            String phoneNumber = contactInfo[1];

            contacts.put(name,phoneNumber);
            line = scanner.nextLine();
        }
        while (true){
            if ("stop".equals(line =scanner.nextLine())){
                break;
            }
            String nameSearch = line;
            if (contacts.containsKey(nameSearch)){

                    System.out.printf("%s -> %s%n",nameSearch, contacts.get(nameSearch));

            }else{
                System.out.printf("Contact %s does not exist.%n",nameSearch);
            }
        }



    }
}
