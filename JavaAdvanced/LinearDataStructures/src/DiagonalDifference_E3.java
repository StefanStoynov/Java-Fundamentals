import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference_E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input[j];
            }
        }
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        int iterator = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                leftDiagonalSum += matrix[i][j+iterator];
                rightDiagonalSum += matrix[i][matrix.length-1-iterator];
                iterator++;
                break;
            }
        }
        int absDiferenceDiagonals = Math.abs(leftDiagonalSum - rightDiagonalSum);
        System.out.println(absDiferenceDiagonals);
    }
}
