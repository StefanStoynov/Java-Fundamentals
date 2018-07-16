package p03_StackIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomStack<T> implements Iterable<T> {
    private List<T> list;


    public CustomStack() {
        this.list = new ArrayList<>();
    }

    public void push(T element) {
        list.add(0,element);
    }

    public void pop() {
        if (list.isEmpty()){
            System.out.println("No elements");
            return;
        }
        this.list.remove(0);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
