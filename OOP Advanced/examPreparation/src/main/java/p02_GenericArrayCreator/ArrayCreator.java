package p02_GenericArrayCreator;


import java.lang.reflect.Array;

public class ArrayCreator<T> {

    public static <T> T[] create(int length, T element) {
        T[] elements = (T[]) new Object[length];
        for (int i = 0; i < length; i++) {
            elements[i] = element;
        }
        return elements;
    }

    public static <T> T[] create(Class<T>cl, int length, T element) {
        T[] elements = (T[]) Array.newInstance(cl,length);
        for (int i = 0; i < length; i++) {
            elements[i] = element;
        }
        return elements;
    }
}
