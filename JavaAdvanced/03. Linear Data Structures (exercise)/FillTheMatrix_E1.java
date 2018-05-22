import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix_E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int matrixSize = Integer.parseInt(input[0]);
        String patern = input[1];
        if (patern.equals("A")) {

            for (int[] element : paternA(matrixSize, patern)) {
                for (int i : element) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } else {
            for (int[] element : paternB(matrixSize, patern)) {
                for (int i : element) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }

    }

    public static int[][] paternA(int size, String paternA) {
        int[][] matrixA = new int[size][size];

        for (int i = 0; i < matrixA.length; i++) {
            int sum = i + 1;

            for (int j = 0; j < matrixA[i].length; j++) {

                matrixA[i][j] = sum;
                sum += matrixA.length;
            }
        }
        return matrixA;
    }

    public static int[][] paternB(int size, String paternB) {
        int[][] matrixB = new int[size][size];
        int sum = 1;
        int secondIndex = 0;
        for (int i = 0; i < matrixB.length; i++) {

            if (secondIndex == 0) {
                for (int j = secondIndex; j < matrixB[i].length; j++) {
                    matrixB[j][i] = sum++;
                    secondIndex++;
                }
                secondIndex--;
            } else {
                for (int j = secondIndex; j >= 0; j--) {
                    matrixB[j][i] = sum++;
                    secondIndex--;
                }
                secondIndex++;
            }
        }
        return matrixB;
    }
}
