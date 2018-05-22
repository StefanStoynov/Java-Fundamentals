import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]dimentions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int rows = dimentions[0];
        int cols = dimentions[1];

        int[][]matix = new int[rows][cols];

        for (int i = 0; i <rows ; i++) {
            int[]reminder = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < matix[0].length; j++) {
                matix[i][j]= reminder[j];
            }
        }
        int bestSum = Integer.MIN_VALUE;
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i <matix.length-1 ; i++) {
            for (int j = 0; j <matix[0].length-1 ; j++) {
                int sum = 0;
                 sum = matix[i][j]+ matix[i][j+1]+ matix[i+1][j]+ matix[i+1][j+1];
                if (sum>bestSum){
                    bestSum=sum;
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }
        for (int i = rowIndex; i <rowIndex+2 ; i++) {
            for (int j = colIndex; j < colIndex+2; j++) {
                System.out.print(matix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(bestSum);
    }
}
