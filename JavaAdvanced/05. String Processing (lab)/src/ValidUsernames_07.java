import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        String line;
        while (true){
            if ("END".equals(line = scanner.nextLine())){
                break;
            }
            Pattern pattern = Pattern.compile("^[\\w-]{3,16}$");
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()){
                list.add("valid");
            }else{
                list.add("invalid");
            }
        }
        if (list.contains("valid")) {
            for (String s : list) {
                System.out.println(s);
            }
        }


    }
}
