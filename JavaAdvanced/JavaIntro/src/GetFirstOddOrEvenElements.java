

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] condition = scanner.nextLine().split(" ");
        String evenOrOdd = condition[2];
        int condition1 = Integer.parseInt(condition[1]);

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                even.add(nums[i]);

            } else {

                odd.add(nums[i]);
            }
        }
        if (evenOrOdd.equals("even")) {
            for (Integer integer : even) {
                System.out.printf("%d ", integer);
            }
        } else {
            for (Integer integer : odd) {
                System.out.printf("%d ", integer);
            }
        }
    }


}



