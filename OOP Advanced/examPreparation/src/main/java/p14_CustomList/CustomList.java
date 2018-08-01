package p14_CustomList;

public interface CustomList<T extends Comparable<T>> {

    void add(T element);

    void remove(T element);

    boolean containce(T element);

    void swap(int newIndex, int oldIndex);

    int countGreaterThan(T element);

    T getMax();

    T getMin();

    void sort();
}
