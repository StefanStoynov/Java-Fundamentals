package p09_CustomListIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomListImpl<T extends Comparable<T>> implements Iterable<T> {

    private List<T> elements;

    public CustomListImpl() {
        this.elements = new ArrayList<>();
    }


    public void add(T element) {
        elements.add(element);
    }


    public T remove(int index) {
        return this.elements.remove(index);
    }


    public boolean contains(Comparable element) {
        return this.elements.contains(element);
    }


    public void swap(int oldIndex, int newIndex) {
        T temp = this.elements.get(oldIndex);
        this.elements.set(oldIndex, this.elements.get(newIndex));
        this.elements.set(newIndex, temp);

    }


    public int countGreaterThan(T element) {
        return this.elements.stream().filter(e -> e.compareTo(element) > 0).collect(Collectors.toList()).size();
    }


    public T getMax() {
        return Collections.max(this.elements);
    }


    public T getMin() {
        return Collections.min(this.elements);
    }


    public Iterable<T> getElements() {
        return this.elements;
    }


    public void sort() {
        this.elements.sort((a, b) -> a.compareTo(b));
    }

    public Iterator<T> iterator() {
        return this.elements.iterator();
    }
}
