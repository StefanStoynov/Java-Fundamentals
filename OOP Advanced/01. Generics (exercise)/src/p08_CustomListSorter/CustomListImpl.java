package p08_CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CustomListImpl<T extends Comparable<T>> implements CustomList<T> {

   private List<T> elements;

    public CustomListImpl() {
        this.elements = new ArrayList<>();
    }


    @Override
    public void add(T element) {
        elements.add(element);
    }

    @Override
    public T remove(int index) {
        return this.elements.remove(index);
    }

    @Override
    public boolean contains(Comparable element) {
        return this.elements.contains(element);
    }

    @Override
    public void swap(int oldIndex, int newIndex) {
        T temp = this.elements.get(oldIndex);
        this.elements.set(oldIndex, this.elements.get(newIndex));
        this.elements.set(newIndex, temp);

    }

    @Override
    public int countGreaterThan(T element) {
       return this.elements.stream().filter(e-> e.compareTo(element)>0).collect(Collectors.toList()).size();
    }

    @Override
    public T getMax() {
       return Collections.max(this.elements);
    }

    @Override
    public T getMin() {
        return Collections.min(this.elements);
    }

    @Override
    public Iterable<T> getElements(){
        return this.elements;
    }

    @Override
    public void sort() {
          this.elements.sort((a,b)-> a.compareTo(b));
    }

}
