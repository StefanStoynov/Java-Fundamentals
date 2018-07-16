package p02_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListyIterator<T> implements Iterable<T> {
    private List<T> list;
    private int index;

    public ListyIterator(T... args) {
        this.list = new ArrayList<>();
        Collections.addAll(list, args);
    }

    public boolean move() {
        if (hasNext()) {
            index++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        if (list.size() - 1 > index) {
            return true;
        }
        return false;
    }

    public void print() {
        if (list.isEmpty()) {
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(list.get(index));
        }

    }

    public void printAll() {
        if (list.isEmpty()) {
            System.out.println("Invalid Operation!");
        } else {
            for (T t : list) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
