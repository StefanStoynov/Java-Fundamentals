package p09_GenericBoxOfInteger;

public class Box<T> {
    T item;

    public Box(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",item.getClass().getName(), this.item);
    }
}
