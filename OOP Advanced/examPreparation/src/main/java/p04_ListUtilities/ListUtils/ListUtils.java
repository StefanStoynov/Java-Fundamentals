package p04_ListUtilities.ListUtils;


import java.util.List;

public class ListUtils {


    public static <T extends Comparable<T>> T getMax(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException();
        } else {
            T max = list.get(0);
            for (T t : list) {
                if (t.compareTo(max) > 0) {
                    max = t;
                }
            }
            return max;
        }
    }

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException();
        } else {
            T min = list.get(0);
            for (T t : list) {
                if (t.compareTo(min) < 0) {
                    min = t;
                }
            }
            return min;
        }
    }
}
