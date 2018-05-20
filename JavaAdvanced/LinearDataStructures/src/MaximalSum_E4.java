import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum_E4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixDimentions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = matrixDimentions[0];
        int cols = matrixDimentions[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input[j];
            }
        }

        int sumMax = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < matrix.length-2; i++) {
            for (int j = 0; j < matrix[0].length-2; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];
                if (sum > sumMax) {
                    sumMax = sum;
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        System.out.printf("Sum = %d%n",sumMax);
        for (int i = rowIndex; i <rowIndex+3; i++) {
            for (int j = colIndex; j <colIndex+3 ; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
