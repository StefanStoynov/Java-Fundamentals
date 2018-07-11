package p09_CustomListIterator;


public class Sorter <T> {

    public static <T extends Comparable<T>> void sort(CustomListImpl<T> list){
        list.sort();
    }

}
