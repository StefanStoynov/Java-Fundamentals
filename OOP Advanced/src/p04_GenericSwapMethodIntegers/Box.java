package p04_GenericSwapMethodIntegers;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void addItem(T item) {
        this.list.add(item);
    }

    public void swapMetod(int oldPosition, int newPosition) {
        T item = this.list.get(oldPosition);
        T item1 = this.list.get(newPosition);
        this.list.set(newPosition,item);
        this.list.set(oldPosition, item1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(String.format("%s: %s", t.getClass().getName(), t)).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
