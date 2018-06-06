import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class p03_ChessKnight {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[][] chesBoard = new String[8][8];

        for (int i = 0; i < chesBoard.length; i++) {
            chesBoard[i] = reader.readLine().split("\\|");
        }
        StringBuilder sb = new StringBuilder();
        ArrayDeque<String >print = new ArrayDeque<>();
        int[] position = Arrays.stream(reader.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int row = position[0];
        int col = position[1];
        int rowNew = 0;
        int colNew = 0;
        int outsideBoardCunt = 0;
        int invalidMuves = 0;
        String line;
        while (true) {
            if ("END".equals(line = reader.readLine())) {
                break;
            }

            String[] input = line.split("(?!^)");
            rowNew = Integer.parseInt(input[6]);
            colNew = Integer.parseInt(input[7]);

            if (isOnBoard(rowNew, colNew) && isValidMuve(row, rowNew, col, colNew)&&!chesBoard[rowNew][colNew].equals(" ")) {
               print.add(chesBoard[rowNew][colNew]);

                   sb.append(chesBoard[rowNew][colNew]).append(", ");

            }
        }
        if (!isOnBoard(rowNew, colNew)) {
            outsideBoardCunt++;
        }
        if (!isValidMuve(row, rowNew, col, colNew)) {
            invalidMuves++;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        System.out.printf("Pieces take: %s%n",sb);
        System.out.printf("Invalid moves: %d%n",invalidMuves);
        System.out.printf("Board out moves: %d",outsideBoardCunt);
    }

    public static boolean isOnBoard(int rowNew, int colNew) {
        return rowNew <= 7 && rowNew >= 0 && colNew <= 7 && colNew >= 0;
    }

    public static boolean isValidMuve(int row, int rowNew, int col, int colNew) {
        return Math.abs(row - rowNew) <= 2 && Math.abs(col - colNew) <= 1;
    }
}
