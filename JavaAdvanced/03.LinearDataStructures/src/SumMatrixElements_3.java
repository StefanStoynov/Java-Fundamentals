import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimentions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = dimentions[0];
        int cols = dimentions[1];

        int[][] matrix = new int[rows][cols];
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            int[]reminder = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j <cols ; j++) {
                matrix[i][j]=reminder[j];
                sum += reminder[j];
            }
            System.out.println();
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
