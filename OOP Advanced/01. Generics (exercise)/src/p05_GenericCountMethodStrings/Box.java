package p05_GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Comparable> {
    List<T > items ;

    public Box() {
        this.items = new ArrayList<>();
    }

    public void addItem (T item){
        this.items.add(item);
    }

    public int returnMethod(T item){
        int countElements = 0;
        for (T t : items) {
            if (t.compareTo(item)>0){
                countElements++;
            }
        }
        return countElements;
    }

}
