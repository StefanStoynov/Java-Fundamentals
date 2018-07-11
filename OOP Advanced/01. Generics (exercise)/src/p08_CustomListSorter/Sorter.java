package p08_CustomListSorter;


import java.util.List;

public class Sorter <T> {

    public static <T extends Comparable<T>> void sort(CustomList<T> list){
        list.sort();
    }

}
