import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p03_ChessKnight {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> figuresTaken = new LinkedList<>();
        int invalidMuves = 0;
        int outOfBoard = 0;
        String[][] matrix = new String[8][8];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = reader.readLine().split("\\|");
        }

        String startPosition = reader.readLine();
        int statRow = Integer.parseInt(startPosition.charAt(0) + "");
        int statCol = Integer.parseInt(startPosition.charAt(1) + "");

        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }
            String[] tokens = line.split(" -> ");
            int newRow = Integer.parseInt(tokens[1].charAt(0) + "");
            int newCol = Integer.parseInt(tokens[1].charAt(1) + "");

            if (!isValid(statRow, statCol, newRow, newCol)) {
                invalidMuves++;
                continue;
            }
            if (!isOnBoard(newRow, newCol)) {
                outOfBoard++;
                continue;
            }

            if (isValid(statRow, statCol, newRow, newCol) && isOnBoard(newRow, newCol)) {
                if (!matrix[newRow][newCol].equals(" ")) {
                    figuresTaken.add(matrix[newRow][newCol]);

                }
                statRow = newRow;
                statCol = newCol;
            }

        }
        System.out.print("Pieces take: ");
        System.out.println(String.join(", ",figuresTaken));
        System.out.println("Invalid moves: " + invalidMuves);
        System.out.println("Board out moves: " + outOfBoard);



    }

    public static boolean isValid(int startRow, int startCol, int newRow, int newCol) {
        if (Math.abs(startRow - newRow) == 2 && Math.abs(startCol - newCol) == 1
                || Math.abs(startRow - newRow) == 1 && Math.abs(startCol - newCol) == 2) {
            return true;
        }
        return false;
    }

    public static boolean isOnBoard(int row, int col) {
        if (row < 8 && row >= 0 && col < 8 && col >= 0) {
            return true;
        }
        return false;
    }

}
