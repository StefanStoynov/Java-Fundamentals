package p09_CustomListIterator;

public interface CustomList<T extends Comparable&Iterable<T>> {
    void add(T element);

    T remove(int index);

    boolean contains(T element);

    void swap(int oldIndex, int newIndex);

    int countGreaterThan(T element);

    T getMax();

    T getMin();

    Iterable<T> getElements();

    void sort();
}
