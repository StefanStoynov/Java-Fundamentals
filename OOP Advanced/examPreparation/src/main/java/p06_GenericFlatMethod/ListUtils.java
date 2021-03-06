package p06_GenericFlatMethod;


import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static List<Integer> getNullIndices(List<?> list) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)== null) {
                indexes.add(i);
            }
        }
        return indexes;
    }
    public static <T> void flatten(List<? super T> dest, List<List<? extends T>>src){

        for (List list : src) {
            dest.addAll(list);
        }

    }


}
