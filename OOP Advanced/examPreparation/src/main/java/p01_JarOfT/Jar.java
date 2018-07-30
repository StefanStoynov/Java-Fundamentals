package p01_JarOfT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Jar<T> implements Iterable<T>{
    private List<T> elements;

    public Jar() {
        this.elements = new ArrayList<T>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public T remove() {
        T removedElement = this.elements.get(this.elements.size()-1);
        this.elements.remove(removedElement);
        return removedElement;
    }

    public Iterator<T> iterator() {
        return this.elements.iterator();
    }
}
