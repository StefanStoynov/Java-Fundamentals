import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;

public class p04_Ranking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> contests = new LinkedHashMap<>();
        Map<String, Map<String, Integer>> students = new TreeMap<>();
        String line;
        while (true) {
            if ("end of contests".equals(line = reader.readLine())) {
                break;
            }

            String[] contest = line.split(":");
            if (contest.length > 2) {
                continue;
            }
            String contestz = contest[0];
            String password = contest[1];

            contests.putIfAbsent(contestz, password);


        }

        while (true) {
            if ("end of submissions".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split("=>");
            String exam = tokens[0];
            String password = tokens[1];
            String name = tokens[2];
            int score = Integer.parseInt(tokens[3]);

            if (contests.containsKey(exam) && contests.containsValue(password)) {
                students.putIfAbsent(name, new TreeMap<>());
                students.get(name).putIfAbsent(exam, score);
                if (students.get(name).containsKey(exam)) {
                    int last = students.get(name).get(exam);
                    if (last < score) {
                        students.get(name).put(exam, score);
                    }
                }

            }
        }

        int best = 0;
        String studentBest = "";

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Map<String, Integer>> student : students.entrySet()) {
            Integer currentSum = student.getValue().values().stream().mapToInt(Number::intValue).sum();

            if (best < currentSum) {
                best = currentSum;
                studentBest = student.getKey();
            }
        }
        System.out.println(String.format("Best candidate is %s with total %d points.\n" +
                "Ranking: ", studentBest, best));

        students.entrySet().stream().forEach(x-> {
            System.out.println(x.getKey());
            x.getValue()
                    .entrySet()
                    .stream()
                    .sorted((x1,x2)-> x2.getValue().compareTo(x1.getValue()))
                    .forEach(c-> System.out.println(String.format("#  %s -> %d",c.getKey(),c.getValue())));
        });
    }

}
