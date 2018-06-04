import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p05_AppliedArithmetics {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




        Function<List<Integer>, List<Integer>> add = number -> {
            List<Integer> addOne = new LinkedList<>();
            for (Integer num :number) {
                addOne.add(num+1);
            }
            return addOne;
        };
        Function<List<Integer>,List<Integer>> subtract = number ->{
            List<Integer>subtracted = new LinkedList<>();
            for (Integer num : number) {
                subtracted.add(num-1);
            }
            return subtracted;
        };
        Function<List<Integer>,List<Integer>> multiply = number ->{
            List<Integer>multiplied = new LinkedList<>();
            for (Integer num : number) {
                multiplied.add(num*2);
            }
            return multiplied;
        };

        Consumer<Integer> print = number -> System.out.print(number + " ");
        String line = reader.readLine();
        if (line.isEmpty()){
            return;
        }
        List<Integer> numbers = Arrays
                .stream(line.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());





        while (true) {
            if ("end".equals(line)) {
                break;
            }

            switch (line) {
                case "add":
                   numbers = add.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "print":
                    for (int number : numbers) {
                        print.accept(number);
                    }
                    break;
            }
            line = reader.readLine();

        }
    }
}
