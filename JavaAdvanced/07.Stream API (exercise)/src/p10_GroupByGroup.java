import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.*;

public class p10_GroupByGroup {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,List<String>> students =new HashMap<>();
        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("\\s+");
            String fullName = tokens[0]+" "+tokens[1];
            String group = tokens[2];

            if (!students.containsKey(group)){
                List<String> names = new LinkedList<>();
                students.put(group,names);
            }
            students.get(group).add(fullName);
        }
        students.entrySet().stream().forEach(s-> System.out.println(s.getKey()+" - "+String.join(", ",s.getValue())));
    }
}
