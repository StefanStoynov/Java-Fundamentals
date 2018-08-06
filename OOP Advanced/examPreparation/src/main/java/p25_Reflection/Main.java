package p25_Reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Class<Reflection> ref = Reflection.class;
        System.out.println(ref);
        System.out.println(ref.getName());
        System.out.println(ref.getSimpleName());
        System.out.println(ref.getSuperclass());
        Class[]interfaces = ref.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
        Reflection reflection = ref.getDeclaredConstructor().newInstance();
        System.out.println(reflection);
    }
}
