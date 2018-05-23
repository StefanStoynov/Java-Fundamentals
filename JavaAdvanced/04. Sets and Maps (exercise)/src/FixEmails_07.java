import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,String>contactInfo = new LinkedHashMap<>();

        String line;
        while (true){
            if ("stop".equals(line = scanner.nextLine())){
                break;
            }
            String name = line;
            String email = scanner.nextLine();
            if (email.endsWith(".com")|| email.endsWith(".uk")|| email.endsWith(".us")){
                continue;
            }else{
                contactInfo.put(name,email);
            }
        }
        for (Map.Entry<String, String> contact : contactInfo.entrySet()) {
            System.out.printf("%s -> %s%n",contact.getKey(),contact.getValue());
        }
    }
}
