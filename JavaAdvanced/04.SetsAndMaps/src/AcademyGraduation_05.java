import java.util.*;

public class AcademyGraduation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, double[]> studentInfo = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String studentName = scanner.nextLine();
            double[] grades = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            studentInfo.put(studentName, grades);
        }

        for (Map.Entry<String, double[]> studentEntry : studentInfo.entrySet()) {
            double avarageGrade = 0;
            for (int i = 0; i < studentEntry.getValue().length; i++) {
                avarageGrade += studentEntry.getValue()[i];
            }
            avarageGrade/= studentEntry.getValue().length;

            System.out.printf("%s is graduated with %s%n", studentEntry.getKey(),avarageGrade);
        }
    }
}
