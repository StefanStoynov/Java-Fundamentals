package p07_CustomList;

import java.util.List;

public interface CustomList<T extends Comparable<T>> {
    void add(T element);

    T remove(int index);

    boolean contains(T element);

    void swap(int oldIndex, int newIndex);

    int countGreaterThan(T element);

    T getMax();

    T getMin();


    Iterable<T> getElements();
}
