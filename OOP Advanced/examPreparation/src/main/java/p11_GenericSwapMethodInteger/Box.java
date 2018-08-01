package p11_GenericSwapMethodInteger;


import java.util.List;

public class Box<T> {
    private List<T> list;

    public Box(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return this.list;
    }

    public void swap(int oldIndex, int newIndex) {
        T element1 = this.list.get(oldIndex);
        T element2 = this.list.get(newIndex);

        this.list.remove(element1);
        this.list.add(newIndex, element1);
        this.list.remove(element2);
        this.list.add(oldIndex, element2);


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
