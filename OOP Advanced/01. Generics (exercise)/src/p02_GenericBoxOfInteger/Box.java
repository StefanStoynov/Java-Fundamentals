package p02_GenericBoxOfInteger;

public class Box<T> {
    private T type;

    public Box(T type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s: %d",type.getClass().getName(), type);
    }
}
