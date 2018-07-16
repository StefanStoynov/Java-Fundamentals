package p04_Froggy;

import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Lake<T> implements Iterable<T> {
    private List<T> lakeNumbers;

    public Lake(List<T> lakeNumbers) {
        this.lakeNumbers = lakeNumbers;
    }

    @Override
    public Iterator<T> iterator() {
        return new Frog();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        for (T number : this) {
            action.accept(number);
        }
    }

    public final class Frog implements Iterator<T> {
        private boolean isEven;
        private int index;

        public Frog() {
            this.isEven = true;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            boolean hasNext = this.index< lakeNumbers.size();
            if (!this.isEven && !hasNext){
                return false;
            }else if(this.isEven && !hasNext){
                if (lakeNumbers.size()==1){
                    return false;
                }
                this.isEven = false;
                this.index =1;
                return true;
            }
            return true;
        }

        @Override
        public T next() {
            T t = lakeNumbers.get(this.index);
            this.index += 2;
            return t;
        }


    }
}
