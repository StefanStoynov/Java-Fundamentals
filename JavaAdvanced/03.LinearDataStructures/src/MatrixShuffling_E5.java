import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling_E5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixDimentions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = matrixDimentions[0];
        int cols = matrixDimentions[1];

        String[][] matrix = new String[rows][cols];
        String[][] temp = new String[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input[j];
            }
        }
        String command = scanner.nextLine();
        while (!"END".equals(command)) {
            String[] comandsAndCoordinates = command.split("\\s+");
            if (comandsAndCoordinates.length != 5) {
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                comandsAndCoordinates = command.split("\\s+");
            }
            int row = Integer.parseInt(comandsAndCoordinates[1]);
            int col = Integer.parseInt(comandsAndCoordinates[2]);
            int rowSwap = Integer.parseInt(comandsAndCoordinates[3]);
            int colSwap = Integer.parseInt(comandsAndCoordinates[4]);

            if (!"swap".equals(comandsAndCoordinates[0])
                    || row > matrix.length
                    || col > matrix[0].length) {

                System.out.println("Invalid input!");
                command = scanner.nextLine();

            } else {


                temp[row][col] = matrix[row][col];
                matrix[row][col] = matrix[rowSwap][colSwap];
                matrix[rowSwap][colSwap] = temp[row][col];
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[0].length; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }

                command = scanner.nextLine();

            }

        }
    }
}
