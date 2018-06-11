import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01_Internship {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Pattern pattern = Pattern.compile("[A-Z{1}][a-z]+ [A-Z{1}][a-z]+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        int problemsCount = Integer.parseInt(reader.readLine());
        int candidatesCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < problemsCount; i++) {
            String line = reader.readLine();
            stack.push(line);
        }

        for (int i = 0; i < candidatesCount; i++) {
            String name = reader.readLine();
            Matcher matcher = pattern.matcher(name);
            if (matcher.find()) {
                queue.add(name);
            } else {
                continue;
            }
        }
        while (queue.size() > 1 && stack.size() > 0  ) {


            for (int i = 0; i < queue.size(); i++) {
                if (queue.size()==1){
                    break;
                }
                String candidate = queue.getFirst();
                String problem = stack.peek();
                int problemSum = problem.chars().sum();
                int candidateSum = candidate.chars().sum();
                if (candidateSum >= problemSum) {
                    System.out.println(String.format("%s solved %s.", candidate, problem));
                    stack.pop();
                    queue.remove();
                    queue.add(candidate);

                }else{
                    System.out.println(String.format("%s failed %s.",candidate,problem));
                    stack.pop();
                    stack.add(problem);
                    queue.remove();
                }
            }


        }
        if (queue.size()==1){
            System.out.println(String.format("%s gets the job!",queue.getFirst()));
        }else{
            System.out.println(String.join(", ",queue));
        }

    }
}
