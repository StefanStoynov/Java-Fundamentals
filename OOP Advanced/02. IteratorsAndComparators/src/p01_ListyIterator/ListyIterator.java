package p01_ListyIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListyIterator<T> {
    private List<T> list;
    private int index;

    public ListyIterator(T... args) {
        this.list = new ArrayList<>();
        Collections.addAll(list,args);
    }

    public boolean move(){
        if (hasNext()){
            index++;
            return true;
        }
        return false;
    }

    public boolean hasNext(){
        if (list.size()-1>index){
            return true;
        }
        return false;
    }

    public void print(){
        if (list.isEmpty()){
            System.out.println("Invalid Operation!");
        }else{
            System.out.println(list.get(index));
        }

    }

}
