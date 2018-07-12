package p10_Tuple;

public class Tuple<T,S> {
    private T item1;
    private S item2;

    public Tuple(T item1, S item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s",this.item1,this.item2);
    }
}
