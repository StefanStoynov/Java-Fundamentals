package p14_CustomList;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Comparable<T>> implements CustomList<T>{
    private List<T> myList;

    public MyList() {
        this.myList = new ArrayList<>();
    }
    @Override
    public void add(T element) {
        this.myList.add(element);
    }
    @Override
    public void remove(T element) {
        if (this.myList.isEmpty()) {
            throw new IllegalArgumentException("No elements to remove");
        }
        this.myList.remove(element);
    }
    @Override
    public boolean containce(T element) {
        return this.myList.contains(element);
    }
    @Override
    public void swap(int newIndex, int oldIndex) {
        if (this.myList.size() < 2) {
            throw new IllegalArgumentException("Not enought elements in the List");
        }
        T element1 = this.myList.get(oldIndex);
        T element2 = this.myList.get(newIndex);

        this.myList.remove(element1);
        this.myList.add(newIndex, element1);
        this.myList.remove(element2);
        this.myList.add(oldIndex, element2);

    }
    @Override
    public int countGreaterThan(T element) {
        int count = 0;
        for (T e : myList) {
            if (e.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
    @Override
    public T getMax() {
        if (this.myList.isEmpty()) {
            throw new IllegalArgumentException("No elements in the List");
        }
        T max = this.myList.get(0);
        for (T e : myList) {
            if (e.compareTo(max) > 0) {
                max = e;
            }
        }
        return max;
    }
    @Override
    public T getMin() {
        if (this.myList.isEmpty()) {
            throw new IllegalArgumentException("No elements in the List");
        }
        T min = this.myList.get(0);
        for (T e : myList) {
            if (e.compareTo(min) < 0) {
                min = e;
            }
        }
        return min;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : myList) {
            sb.append(t).append(System.lineSeparator());
        }
        return sb.toString();
    }


}
