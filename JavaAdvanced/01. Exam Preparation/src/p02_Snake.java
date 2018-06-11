import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02_Snake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int lenght = Integer.parseInt(reader.readLine());
        String[] commands = reader.readLine().split(", ");
        String[][]matrix = new String[lenght][lenght];
        for (int i = 0; i < lenght; i++) {
            String []line = reader.readLine().split("\\s+");
            matrix[i] = line;
        }
        int snakeLenght = 1;
        int startRow = 0;
        int startCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j].equals("s")){
                    startRow = i;
                    startCol = j;
                    break;
                }
            }
        }
        for (int i = 0; i <commands.length ; i++) {
            if ("left".equals(commands[i])){
                if (startCol == 0){
                    startCol++;
                }
                startCol--;
                if (matrix[startRow][startCol].equals("e")){
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }else if (matrix[startRow][startCol].equals("f")){
                    snakeLenght++;
                    matrix[startRow][startCol] = "*";
                }

            }else if("right".equals(commands[i])){
                if (startCol == lenght-1){
                    startCol--;

                }
                startCol++;
                if (matrix[startRow][startCol].equals("e")){
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }else if (matrix[startRow][startCol].equals("f")){
                    snakeLenght++;
                    matrix[startRow][startCol] = "*";
                }
            }else if ("up".equals(commands[i])){
                if (startRow == 0){
                    startRow++;
                }
                startRow--;
                if (matrix[startRow][startCol].equals("e")){
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }else if (matrix[startRow][startCol].equals("f")){
                    snakeLenght++;
                    matrix[startRow][startCol] = "*";
                }
            }else if ("down".equals(commands[i])){
                if (startRow == lenght-1){
                    startRow--;
                }
                startRow++;
                if (matrix[startRow][startCol].equals("e")){
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                }else if (matrix[startRow][startCol].equals("f")){
                    snakeLenght++;
                    matrix[startRow][startCol] = "*";
                }
            }
        }
        int foodCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j].equals("f")){
                    foodCount++;
                }
            }
        }
        if (foodCount > 0){
            System.out.println(String.format("You lose! There is still %d food to be eaten.",foodCount));
        }else{
            System.out.println(String.format("You win! Final snake length is %d",snakeLenght));
        }

    }

}
