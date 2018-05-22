import java.util.Scanner;

public class MatrixOfPalindromes_E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);


        String[][] matrix = new String[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char first = (char)('a'+i);
                char second = (char)('a'+i+j);
                String replaced = Character.toString(first)+Character.toString(second)+Character.toString(first);
                matrix[i][j] = replaced;
                System.out.println();
            }
        }
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string+ " ");
            }
            System.out.println();
        }
    }
}
